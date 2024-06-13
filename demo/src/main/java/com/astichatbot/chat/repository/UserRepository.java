package com.astichatbot.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.astichatbot.chat.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}