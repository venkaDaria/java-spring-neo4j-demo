package com.example.venka.demo.dao;

import com.example.venka.demo.model.Message;

import java.util.Optional;

public interface MessageDAO {

    void insert(final Message message);

    void delete(final Long id);

    Iterable<Message> getAll();

    Optional<Message> getById(final Long id);
}
