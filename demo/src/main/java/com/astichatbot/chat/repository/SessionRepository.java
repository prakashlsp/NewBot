package com.astichatbot.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.astichatbot.chat.entity.Session;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {}