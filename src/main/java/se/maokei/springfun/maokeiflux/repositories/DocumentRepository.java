package se.maokei.springfun.maokeiflux.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import se.maokei.springfun.maokeiflux.domain.Book;

public interface DocumentRepository extends ReactiveMongoRepository<Book, String> {
}
