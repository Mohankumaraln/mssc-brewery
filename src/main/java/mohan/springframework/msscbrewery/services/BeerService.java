package mohan.springframework.msscbrewery.services;

import mohan.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(BeerDto beerDto, UUID beerId);

    void deleteById(UUID beerId);
}