package de.denizugurlu.spring5webapp.repositories;

import de.denizugurlu.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
