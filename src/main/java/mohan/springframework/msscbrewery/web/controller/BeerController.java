package mohan.springframework.msscbrewery.web.controller;

import mohan.springframework.msscbrewery.services.BeerService;
import mohan.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){

        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody BeerDto beerDto){

        BeerDto bt = beerService.saveNewBeer(beerDto);
        HttpHeaders headers = new HttpHeaders();
        //TOdo URL
        headers.add("Location","http://localhost:8080/api/v1/beer/"+bt.getId());
     //   headers.add("Content-Type", "application/json;charset=UTF-8");
        return new  ResponseEntity(headers,HttpStatus.CREATED);

    }

    @PutMapping({"/{beerId}"})
    public  ResponseEntity handleUpdate(@RequestBody BeerDto beerDto,Long beerId){
        beerService.updateBeer(beerDto, beerId);
        return new  ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{beerId}"})
    public  ResponseEntity deleteById(Long beerId){
        beerService.deleteById(beerId);
        return new  ResponseEntity(HttpStatus.NO_CONTENT);
    }
}