package pl.nauka.msscbeerservice.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import pl.nauka.msscbeerservice.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {

}
