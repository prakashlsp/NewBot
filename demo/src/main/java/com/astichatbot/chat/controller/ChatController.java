package com.astichatbot.chat.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.astichatbot.chat.entity.Message;
import com.astichatbot.chat.repository.MessageRepository;

@Controller
public class ChatController {

    @Autowired
    private MessageRepository messageRepository;

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public Message sendMessage(@Payload Message chatMessage) {
        chatMessage.setTimestamp(new Timestamp(System.currentTimeMillis()));
        messageRepository.save(chatMessage);
        return chatMessage;
    }
}
