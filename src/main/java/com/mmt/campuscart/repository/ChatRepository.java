package com.mmt.campuscart.repository;


import com.mmt.campuscart.model.Chat;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChatRepository extends MongoRepository<Chat, String> {
}
