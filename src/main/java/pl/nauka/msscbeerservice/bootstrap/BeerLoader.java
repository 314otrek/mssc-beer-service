package pl.nauka.msscbeerservice.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.nauka.msscbeerservice.domain.Beer;
import pl.nauka.msscbeerservice.repositories.BeerRepository;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {
    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if(beerRepository.count()==0){
            beerRepository.save(Beer.builder()
                    .beerName("MAngo Bobs")
                    .beerStyle("IPA")
                    .quantityOnHand(200)
                    .upc(33701000001L)
                    .price(new BigDecimal(12.95))
                    .minOnHand(12)
                    .build());

        }
        System.out.println("Loaded beers : "+ beerRepository.count());
    }


}
