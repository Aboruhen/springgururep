package guru.springframework.kniaz.springkniaz.repositories;

import guru.springframework.kniaz.springkniaz.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
