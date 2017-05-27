package zeus.api.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import zeus.api.domain.configuration.ConfigurationService;
import zeus.api.domain.entities.Configuration;

/**
 * Created by Lukasz S. on 12.04.2017.
 */

@Component
public class MetaDataLoader implements ApplicationRunner {

//    @Autowired
//    ConfigurationService configurationService;

    public void run(ApplicationArguments args) {

//        Configuration configuration = new Configuration();
//        configuration.setName("jack");
//        configurationService.addConfiguration(configuration);

    }
}
