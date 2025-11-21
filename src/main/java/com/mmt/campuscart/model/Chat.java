package com.mmt.campuscart.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "chats")
public class Chat {

    @Id
    private String id;

    private List<String> participants;

    private List<Message> messages;
}
