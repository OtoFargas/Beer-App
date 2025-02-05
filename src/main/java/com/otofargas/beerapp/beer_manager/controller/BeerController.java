package com.otofargas.beerapp.beer_manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.otofargas.beerapp.beer_manager.model.Beer;
import com.otofargas.beerapp.beer_manager.service.BeerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/beers")
public class BeerController {
    
    @Autowired
    private BeerService beerService;

    @GetMapping
    public List<Beer> getAllBeers() {
        return beerService.getAllBeers();
    }
    

    @PostMapping
    public Beer createBeer(@RequestBody Beer beer) {
        return beerService.saveBeer(beer);
    }

    @GetMapping("/{id}")
    public Beer getBeerById(@PathVariable String id) {
        return beerService.getBeerById();
    }
    
}
