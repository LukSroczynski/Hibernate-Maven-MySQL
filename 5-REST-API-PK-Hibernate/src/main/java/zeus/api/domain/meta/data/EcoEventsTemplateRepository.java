package zeus.api.domain.meta.data;


import org.springframework.data.repository.CrudRepository;
import zeus.api.domain.entities.ConfigurationValues;
import zeus.api.domain.entities.EcoEventsTemplate;

/**
 * Created by Lukasz S. on 05.04.2017.
 */
public interface EcoEventsTemplateRepository extends CrudRepository<EcoEventsTemplate, Long> {
}
