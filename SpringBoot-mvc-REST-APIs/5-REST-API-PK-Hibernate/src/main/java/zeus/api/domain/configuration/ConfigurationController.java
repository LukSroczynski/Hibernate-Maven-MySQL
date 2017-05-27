package zeus.api.domain.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zeus.api.domain.entities.Configuration;
import zeus.api.domain.entities.ConfigurationValues;
import zeus.api.domain.entities.EcoEventsTemplate;
import zeus.api.domain.entities.MetaDataDefEcoEvents;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Lukasz S. on 05.04.2017.
 */
@RestController
public class ConfigurationController {

    @Autowired
    ConfigurationService configurationService;

    @RequestMapping(value = "/eco_config", method = RequestMethod.GET, params = "all_configurations")
    public List<Configuration> getAllConfigurations(){
        return configurationService.getAllConfig();
    }

    @RequestMapping(value = "/eco_config", method = RequestMethod.GET, params = "id_config")
    public Map<String, ConfigurationValues> getAllConfigurationWithValues(
            @RequestParam(name = "id_config") long id_config){
        return configurationService.getAllConfigurationsById(id_config);
    }

    @RequestMapping(value = "/eco_config", method = RequestMethod.GET, params = "id_config_last_updated")
    public Configuration getLastUpdatedConfig(
            @RequestParam(name = "id_config_last_updated") long id_config_last_updated){
        return configurationService.getLastUpdatedConfig(id_config_last_updated);
    }

    @RequestMapping(value = "/eco_config", method = RequestMethod.GET, params = "meta")
    public List<MetaDataDefEcoEvents> getMetaData(){
        return configurationService.getMetaData();
    }

    @RequestMapping(value = "/eco_config", method = RequestMethod.GET, params = "template")
    public Map<String, EcoEventsTemplate> getTemplate(){
        return configurationService.getTemplate();
    }

    @RequestMapping(value = "/eco_config", method = RequestMethod.PUT, params = {"id_config"})
    public void editConfigurationById(
            @RequestParam(name = "id_config") long id_config,
            @RequestBody Map<String, ConfigurationValues> configurationValues) {
        configurationService.editConfiguration(id_config, configurationValues);
    }

    @RequestMapping(value = "/eco_config", method = RequestMethod.PUT)
    public void editConfigurationByConfigurationIdAndMetaId(
            @RequestParam(name = "id_config") long id_config,
            @RequestParam(name = "id_event") long id_event,
            @RequestBody ConfigurationValues configurationValues) {
        configurationService.editConfiguration(id_config, id_event, configurationValues);
    }

    @RequestMapping(value = "/eco_config", method = RequestMethod.POST, params = "create_configuration")
    public Map<String, Long> createEmptyConfiguration(@RequestBody Configuration configuration) {

        if(configuration.getName().equals("")) {
            Map <String, Long> list = new HashMap<>();
            list.put("Configuration name is required", 0L);
            return list;
        } else {
            // Map makes JSON with added configuration ID
            Map <String, Long> list = new HashMap<>();
            list.put("id", configurationService.createEmptyConfiguration(configuration));
            return list;
        }
    }

    private void updateLastUpdated(long id_config) {
        configurationService.updateLastUpdated(id_config);
    }

}
