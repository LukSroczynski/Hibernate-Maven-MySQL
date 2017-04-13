package zeus.api.configuration.events.domain.events.interfaces;


import zeus.api.configuration.events.entities.events.Speed;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Lukasz S. on 05.04.2017.
 */
public interface SpeedRepository extends CrudRepository<Speed, Long> {
}
