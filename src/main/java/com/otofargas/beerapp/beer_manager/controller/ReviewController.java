package com.otofargas.beerapp.beer_manager.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.otofargas.beerapp.beer_manager.model.Beer;
import com.otofargas.beerapp.beer_manager.model.Review;
import com.otofargas.beerapp.beer_manager.service.BeerService;
import com.otofargas.beerapp.beer_manager.service.ReviewService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @Autowired
    private BeerService beerService;

    @GetMapping
    public List<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }

    @PostMapping
    public ResponseEntity<Review> createReview(@Valid @RequestBody Review review) {
        Optional<Beer> beerOptional = beerService.getBeerById(review.getBeerId());
        if (!beerOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(reviewService.saveReview(review));
    }

    @GetMapping("/{id}")
    public Optional<Review> getReviewById(@PathVariable String id) {
        return reviewService.getReviewById(id);
    }

    @GetMapping("/review")
    public List<Review> getReviewsByBeerId(@RequestParam Integer beerId) {
        return reviewService.getReviewsByBeerId(beerId);
    }
}
