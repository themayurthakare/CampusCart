package com.mmt.campuscart.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "products")
public class Product {

    @Id
    private String id;

    private String sellerId;

    private String title;
    private String description;
    private String category;
    private Double price;

    private String condition;
    private String department;

    private List<String> images;

    private String status; // available, sold, pending, rejected

    private LocalDateTime createdAt;
}
