package com.otofargas.beerapp.beer_manager.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.otofargas.beerapp.beer_manager.model.Review;

public interface ReviewRepository extends MongoRepository<Review, Integer> {
    
}
