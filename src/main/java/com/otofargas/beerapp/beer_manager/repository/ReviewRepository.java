package com.otofargas.beerapp.beer_manager.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.otofargas.beerapp.beer_manager.model.Review;

public interface ReviewRepository extends MongoRepository<Review, String> {

    public List<Review> findByBeerId(Integer beerId);
}
