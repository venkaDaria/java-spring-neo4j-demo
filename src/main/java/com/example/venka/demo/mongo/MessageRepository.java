package com.example.venka.demo.mongo;

import com.example.venka.demo.model.Message;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface MessageRepository extends Neo4jRepository<Message, Long> {

}
