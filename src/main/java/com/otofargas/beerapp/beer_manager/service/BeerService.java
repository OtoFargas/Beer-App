package com.otofargas.beerapp.beer_manager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.otofargas.beerapp.beer_manager.model.Beer;
import com.otofargas.beerapp.beer_manager.repository.BeerRepository;

import jakarta.annotation.PostConstruct;
import reactor.core.publisher.Mono;

@Service
public class BeerService {

    public static final String API_URL = "https://random-data-api.com/api/v2/beers?size=2";

    @Autowired
    private BeerRepository beerRepository;

    @PostConstruct
    public void initData() {

        WebClient webClient = WebClient.create(API_URL);

        // Making GET request
        Mono<List<Beer>> beerListMono = webClient.get()
                .retrieve()
                .bodyToFlux(Beer.class)
                .collectList();

        // persisting to db
        List<Beer> beers = beerListMono.block();
        if (beers != null) {
            beers.forEach(beerRepository::save);
        }
    }

    public Beer saveBeer(Beer beer) {
        return beerRepository.save(beer);
    }

    public List<Beer> getAllBeers() {
        return beerRepository.findAll();
    }

    public Optional<Beer> getBeerById(Integer id) {
        return beerRepository.findById(id);
    }
}
