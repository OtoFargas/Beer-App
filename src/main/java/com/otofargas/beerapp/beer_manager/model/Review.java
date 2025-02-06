package com.otofargas.beerapp.beer_manager.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Document(collection = "reviews")
public class Review {

    @Id
    private String id;

    // @DBRef
    @NotNull
    private Integer beerId;

    @NotNull
    @Min(value = 1, message = "Stars must be at least 1")
    @Max(value = 5, message = "Stars cannot be more than 5")
    private Integer stars;

    private String description;
}
