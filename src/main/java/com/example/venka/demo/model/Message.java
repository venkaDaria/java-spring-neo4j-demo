package com.example.venka.demo.model;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@Data
@NodeEntity
public class Message {

    @Id
    @GeneratedValue
    private Long id;

    private String text;
}
