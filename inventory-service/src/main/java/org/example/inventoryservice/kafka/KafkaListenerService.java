package org.example.inventoryservice.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListenerService {

    @KafkaListener(topics = "orders", groupId = "inventory-group")
    public void handleMessage(String message) {
        System.out.println("Inventory Service received message: " + message);
    }
}