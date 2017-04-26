package zeus.api.domain.meta.data;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import zeus.api.domain.entities.Configuration;
import zeus.api.domain.entities.ConfigurationValues;
import zeus.api.domain.keys.ConfigurationValuesId;

import java.util.List;

/**
 * Created by Lukasz S. on 05.04.2017.
 */
public interface ConfigurationRepository extends CrudRepository<Configuration, Long> {
}
