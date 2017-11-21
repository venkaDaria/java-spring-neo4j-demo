package com.example.venka.demo.dao;

import com.example.venka.demo.model.Message;
import com.example.venka.demo.mongo.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MessageDAOImpl implements MessageDAO {

    private MessageRepository dbManager;

    public MessageDAOImpl(@Autowired final MessageRepository dbManager) {
        this.dbManager = dbManager;
    }

    @Override
    public void insert(Message message) {
        dbManager.save(message);
    }

    @Override
    public void delete(Long id) {
        dbManager.deleteById(id);
    }

    @Override
    public Iterable<Message> getAll() {
        return dbManager.findAll();
    }

    @Override
    public Optional<Message> getById(Long id) {
        return dbManager.findById(id);
    }
}
