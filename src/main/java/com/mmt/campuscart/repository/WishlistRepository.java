package com.mmt.campuscart.repository;


import com.mmt.campuscart.model.Wishlist;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WishlistRepository extends MongoRepository<Wishlist, String> {
}
