package com.otofargas.beerapp.beer_manager.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
public class Review {

    @Id
    private Integer id;

    private Integer stars;

    private String description;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public Integer getStars() {
        return stars;
    }

    public String getDescription() {
        return description;
    }

    
}
