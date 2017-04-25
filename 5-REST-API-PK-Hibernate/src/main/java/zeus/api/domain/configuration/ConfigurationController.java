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

    @RequestMapping(value = "/eco_config", method = RequestMethod.GET, params = "all")
    public List<Configuration> getAllConfigurations(){
        return configurationService.getAllConfig();
    }

    @RequestMapping(value = "/eco_config", method = RequestMethod.GET, params = "meta")
    public List<MetaDataDefEcoEvents> getMetaData(){
        return configurationService.getMetaData();
    }

    @RequestMapping(value = "/eco_config", method = RequestMethod.GET, params = "template")
    public List<EcoEventsTemplate> getTemplate(){
        return configurationService.getTemplate();
    }

    @RequestMapping(value = "/eco_config", method = RequestMethod.PUT, params = "id_config")
    public void testId(
            @RequestParam(name = "id_config") long id_config,
            @RequestBody ConfigurationValues configurationValues) {
        configurationService.editConfiguration(id_config, configurationValues);
    }

    @RequestMapping(value = "/eco_config", method = RequestMethod.PUT)
    public void getByConfigurationValuesId(
            @RequestParam(name = "id_config") long id_config,
            @RequestParam(name = "id_meta") long id_meta,
            @RequestBody ConfigurationValues configurationValues) {
        configurationService.editConfiguration(id_config, id_meta, configurationValues);
    }

    @RequestMapping(value = "/eco_config", method = RequestMethod.POST, params = "create_configuration")
    public Map<String, Long> createEmptyConfiguration(@RequestBody Configuration configuration) {

        // Map makes JSON with added configuration ID
        Map <String, Long> list = new HashMap<>();
        list.put("id", configurationService.createEmptyConfiguration(configuration));

        return list;
    }

}
