package custom.api.configuration.events;


import org.springframework.data.repository.CrudRepository;

/**
 * Created by Lukasz S. on 05.04.2017.
 */
public interface ConfigurationRepository extends CrudRepository<Configuration, Long> {
}