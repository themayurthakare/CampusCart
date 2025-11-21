package com.mmt.campuscart.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "reports")
public class Report {

    @Id
    private String id;

    private String reporterId;
    private String reportedUserId;
    private String productId;

    private String reason;
    private String details;

    private String status;

    private LocalDateTime createdAt;
}
