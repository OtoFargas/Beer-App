package com.otofargas.beerapp.beer_manager.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.otofargas.beerapp.beer_manager.repository.BeerRepository;

public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

}
