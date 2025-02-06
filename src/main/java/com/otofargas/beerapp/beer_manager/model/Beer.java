package com.otofargas.beerapp.beer_manager.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "beers")
public class Beer {

    @Id
    private Integer id;

    private String uid;

    private String brand;

    private String name;
    private String style;
    private String hop;
    private String yeast;
    private String malts;
    private String ibu;
    private String alcohol;
    private String blg;
}
