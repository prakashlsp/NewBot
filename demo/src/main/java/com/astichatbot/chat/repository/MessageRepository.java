package com.astichatbot.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.astichatbot.chat.entity.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {}
