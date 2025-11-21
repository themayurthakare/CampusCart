package com.mmt.campuscart.model;


import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Message {

    private String senderId;
    private String text;
    private List<String> attachments;

    private LocalDateTime sentAt;
}
