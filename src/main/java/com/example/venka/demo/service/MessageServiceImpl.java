package com.example.venka.demo.service;

import com.example.venka.demo.dao.MessageDAO;
import com.example.venka.demo.model.Message;
import com.example.venka.demo.model.NullMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class MessageServiceImpl implements MessageService {

    private MessageDAO messageDAO;

    public MessageServiceImpl(@Autowired final MessageDAO messageDAO) {
        this.messageDAO = messageDAO;
    }

    @Override
    public void insert(Message message) {
        messageDAO.insert(message);
    }

    @Override
    public void delete(Long id) {
        messageDAO.delete(id);
    }

    @Override
    public List<Message> getAll() {
        return StreamSupport.stream(messageDAO.getAll().spliterator(), false)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public Message getById(Long id) {
        return messageDAO.getById(id).orElse(NullMessage.getInstance());
    }
}
