package com.mmt.campuscart.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "wishlist")
public class Wishlist {

    @Id
    private String id;

    private String userId;
    private List<String> productIds;
}
