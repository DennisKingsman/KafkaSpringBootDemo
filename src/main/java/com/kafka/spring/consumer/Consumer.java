package com.kafka.spring.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static com.kafka.spring.producer.Producer.TOPIC_NAME;

@Service
public class Consumer {

    @KafkaListener(topics = TOPIC_NAME,groupId = "groupId")
    public void consumeMessage(String message) {
        System.out.println(message);
    }

}
