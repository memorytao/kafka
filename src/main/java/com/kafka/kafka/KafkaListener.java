package com.kafka.kafka;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(topics = "memorytao", groupId = "groupId")
    void listener(String data) {
        System.out.println("Listener received : "  + data + " ");
    }
}
