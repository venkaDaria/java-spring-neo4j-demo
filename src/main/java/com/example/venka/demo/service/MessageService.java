package com.example.venka.demo.service;

import com.example.venka.demo.model.Message;

import java.util.List;

public interface MessageService {

    void insert(final Message message);

    void delete(final Long id);

    List<Message> getAll();

    Message getById(final Long id);
}
