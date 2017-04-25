package zeus.api.domain.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zeus.api.domain.entities.Configuration;
import zeus.api.domain.entities.ConfigurationValues;
import zeus.api.domain.entities.EcoEventsTemplate;
import zeus.api.domain.keys.ConfigurationValuesId;
import zeus.api.domain.entities.MetaDataDefEcoEvents;
import zeus.api.domain.meta.data.ConfigurationRepository;
import zeus.api.domain.meta.data.ConfigurationValuesRepository;
import zeus.api.domain.meta.data.EcoEventsTemplateRepository;
import zeus.api.domain.meta.data.MetaDataDefEcoEventsRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lukasz S. on 07.04.2017.
 */

@Service
public class ConfigurationService {

    @Autowired
    ConfigurationRepository configurationRepository;

    @Autowired
    ConfigurationValuesRepository configurationValuesRepository;

    @Autowired
    MetaDataDefEcoEventsRepository metaDataDefEcoEventsRepository;

    @Autowired
    EcoEventsTemplateRepository ecoEventsTemplateRepository;

    public List<Configuration> getAllConfig(){
        List<Configuration> list = new ArrayList<>();
        configurationRepository.findAll()
                .forEach(list::add);
        return list;
    }

    public List<MetaDataDefEcoEvents> getMetaData(){
        List<MetaDataDefEcoEvents> list = new ArrayList<>();
        metaDataDefEcoEventsRepository.findAll()
                .forEach(list::add);
        return list;
    }

    public List<EcoEventsTemplate> getTemplate(){
        List<EcoEventsTemplate> list = new ArrayList<>();
        ecoEventsTemplateRepository.findAll()
                .forEach(list::add);
        return list;
    }

    public void editConfiguration(long id_config, ConfigurationValues configurationValues) {

//        ConfigurationValues putValues = new ConfigurationValues(
//                new ConfigurationValuesId(id_config, tutaj FOR),
//                configurationValues.getActivation(),
//                configurationValues.getTrigBVal()
//        );

//        configurationValuesRepository.save(putValues);

    }

    public void editConfiguration(long id_config, long id_meta, ConfigurationValues configurationValues) {

        ConfigurationValues putValues = new ConfigurationValues(
                new ConfigurationValuesId(id_config, id_meta),
                configurationValues.getActivation(),
                configurationValues.getTrigBVal()
        );

        configurationValuesRepository.save(putValues);

    }

    public long createEmptyConfiguration(Configuration configuration) {

        createEmptyConfigurationWithName(configuration);
        long config_id = configuration.getId();

        MetaDataDefEcoEvents metaDataDefEcoEvents = new MetaDataDefEcoEvents();
        ArrayList<MetaDataDefEcoEvents> metaData = new ArrayList<>();
        metaData.addAll(getMetaData());

        ConfigurationValues configurationValues = new ConfigurationValues();

        for(MetaDataDefEcoEvents e : metaData) {
            configurationValues.setId(new ConfigurationValuesId(configuration.getId(), e.getId()));
            configurationValuesRepository.save(configurationValues);
        }

        return config_id;
    }

    /**
     * Creates new Configuration
     * @param configuration
     *      Only name is required
     */
    private void createEmptyConfigurationWithName(Configuration configuration) {
        configuration.setName(configuration.getName());
        configurationRepository.save(configuration);
    }
}
