package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import spring.annotations.coaches.features.SadFortuneService;
import spring.annotations.coaches.implementations.SwimCoach;
import spring.annotations.coaches.interfaces.BaseFortuneService;
import spring.annotations.coaches.interfaces.Coach;

/**
 * Created by Surreallistic on 25.03.2017.
 * This is Jave Configuration
 */

@Configuration
//@ComponentScan("spring.annotations")
@PropertySource("classpath:data/sample.properties")
public class ConfigurationViaClass {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadBaseFortuneService());
    }

    // 1. Define Bean for SadFortuneService
    @Bean
    public BaseFortuneService sadBaseFortuneService() {
        return new SadFortuneService();
    }

    // 2. Define Bean for our swim coach AND inject dependency

}
