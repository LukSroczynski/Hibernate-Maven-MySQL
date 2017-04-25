package zeus.api.domain.meta.data;


import org.springframework.data.repository.CrudRepository;
import zeus.api.domain.entities.Configuration;

/**
 * Created by Lukasz S. on 05.04.2017.
 */
public interface ConfigurationRepository extends CrudRepository<Configuration, Long> {
}
