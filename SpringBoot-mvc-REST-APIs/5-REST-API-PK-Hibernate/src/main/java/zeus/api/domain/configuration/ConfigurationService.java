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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Map<String, ConfigurationValues> getAllConfigurationsById(long config_id) {

        ArrayList<MetaDataDefEcoEvents> metaData = new ArrayList<>();
        ArrayList<ConfigurationValues> configValues = new ArrayList<>();
        Map<String, ConfigurationValues> configurationById = new HashMap<>();
        metaData.addAll(getMetaData());

        List<ConfigurationValues> list = new ArrayList<>();

        for(MetaDataDefEcoEvents e : metaData) {
            ConfigurationValues configurationValues = new ConfigurationValues();
            configurationById.put(String.valueOf(e.getId()), configurationValuesRepository.findOne(
                    new ConfigurationValuesId(config_id, e.getId())));
        }

        //put configvalues
        // zrobic z osobnego geta

        return configurationById;
    }

    public Configuration getLastUpdatedConfig(long config_id) {
        return configurationRepository.findOne(config_id);
    }

    public List<MetaDataDefEcoEvents> getMetaData(){
        List<MetaDataDefEcoEvents> list = new ArrayList<>();
        metaDataDefEcoEventsRepository.findAll()
                .forEach(list::add);
        return list;
    }

    public Map<String, EcoEventsTemplate> getTemplate(){
        List<EcoEventsTemplate> list = new ArrayList<>();
        Map<String, EcoEventsTemplate> map = new HashMap();
        ecoEventsTemplateRepository.findAll()
                .forEach(list::add);

        for(EcoEventsTemplate e : list) {
            map.put(String.valueOf(e.getId()),
                    new EcoEventsTemplate(
                            e.getId(),
                            e.getActivation()));
        }

        return map;
    }

    public void editConfiguration(long id_config, Map<String, ConfigurationValues> configurationValues) {

        updateLastUpdated(id_config);
        for (Map.Entry<String, ConfigurationValues> pair : configurationValues.entrySet()) {

            ConfigurationValues putValues = new ConfigurationValues(
                    new ConfigurationValuesId(id_config, Integer.parseInt(pair.getKey())),
                    pair.getValue().getActivation()

            );
            configurationValuesRepository.save(putValues);
        }
    }

    public void editConfiguration(long id_config, long id_meta, ConfigurationValues configurationValues) {

        updateLastUpdated(id_config);
        ConfigurationValues putValues = new ConfigurationValues(
                new ConfigurationValuesId(id_config, id_meta),
                configurationValues.getActivation()
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
            configurationValues.setCompositeId(new ConfigurationValuesId(configuration.getId(), e.getId()));
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

    public void updateLastUpdated(long id_config) {
        List<Configuration> list = new ArrayList<>();
        list.add(configurationRepository.findOne(id_config));
        for(Configuration e : list) {
            configurationRepository.save(new Configuration(id_config, e.getName()));
        }
    }
}
