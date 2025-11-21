package com.mmt.campuscart.repository;


import com.mmt.campuscart.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
