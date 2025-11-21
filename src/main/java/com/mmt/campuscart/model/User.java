package com.mmt.campuscart.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "users")
public class User {
    @Id
    private String id;

    private String name;
    private String email;
    private String password;

    private String role; // STUDENT, ALUMNI, ADMIN
    private String department;
    private Integer graduationYear;

    private String profileImage;
    private String phone;

    private String status; // active, suspended

    private LocalDateTime createdAt;
}
