package com.example.venka.demo.bootstrap;

import com.example.venka.demo.model.Message;
import com.example.venka.demo.mongo.MessageRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

@Configuration
@ConditionalOnProperty(name = "database.recreated", havingValue = "true")
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final MessageRepository messageRepository;

    public DevBootstrap(@Autowired final MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public void onApplicationEvent(@NotNull final ContextRefreshedEvent event) {
        initData();
    }

    private void initData() {
        messageRepository.deleteAll();

        final Message message = new Message();
        message.setText("hello");
        messageRepository.save(message);
    }
}
