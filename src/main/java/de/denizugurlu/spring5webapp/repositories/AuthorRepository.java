package de.denizugurlu.spring5webapp.repositories;

import de.denizugurlu.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
