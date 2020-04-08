package mohan.springframework.msscbrewery.services;

import mohan.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID()).beerName(beerDto.getBeerName()).build();
    }

    @Override
    public void updateBeer(BeerDto beerDto, UUID beerId) {
        System.out.println("UPDATE CALLED");
    }

    @Override
    public void deleteById(UUID beerId) {

    }


}