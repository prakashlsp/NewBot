package com.astichatbot.chat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.astichatbot.chat.entity.Session;
import com.astichatbot.chat.repository.SessionRepository;

@RestController
@RequestMapping("/api")
public class SessionController {

    @Autowired
    private SessionRepository sessionRepository;

    @PostMapping("/sessions")
    public Session createSession(@RequestBody Session session) {
        return sessionRepository.save(session);
    }

    @GetMapping("/sessions/{id}")
    public Session getSession(@PathVariable Long id) {
        return sessionRepository.findById(id).orElse(null);
    }
}

