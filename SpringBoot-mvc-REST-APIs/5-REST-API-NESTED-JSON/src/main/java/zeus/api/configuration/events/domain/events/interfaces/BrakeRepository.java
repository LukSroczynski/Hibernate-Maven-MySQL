package zeus.api.configuration.events.domain.events.interfaces;


import zeus.api.configuration.events.entities.events.Brake;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Lukasz S. on 05.04.2017.
 */
public interface BrakeRepository extends CrudRepository<Brake, Long> {
}