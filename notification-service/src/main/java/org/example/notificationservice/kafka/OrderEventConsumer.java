package org.example.notificationservice.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class OrderEventConsumer {
    @Autowired
    private JavaMailSender mailSender;

    @KafkaListener(topics = "orders", groupId = "notify-group")
    public void listen(String message) {
        System.out.println("Received order message: " + message);
        sendNotificationEmail(message);
    }

    public void sendNotificationEmail(String content) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("sytranvan2205@gmail.com");
        message.setTo("sydeptrai92@gmail.com");
        message.setSubject("New Order Received");
        message.setText("Order content:\n" + content);
        mailSender.send(message);
    }
}
