package com.mmt.campuscart.repository;


import com.mmt.campuscart.model.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<Notification, String> {
}
