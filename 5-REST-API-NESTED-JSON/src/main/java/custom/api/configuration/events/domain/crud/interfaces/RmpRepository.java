package custom.api.configuration.events.domain.crud.interfaces;


import custom.api.configuration.events.entities.events.Rpm;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Lukasz S. on 05.04.2017.
 */
public interface RmpRepository extends CrudRepository<Rpm, Long> {
}