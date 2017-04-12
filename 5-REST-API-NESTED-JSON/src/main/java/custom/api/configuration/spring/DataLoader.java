package custom.api.configuration.spring;

import custom.api.configuration.events.domain.crud.interfaces.MetaEcoRepository;
import custom.api.configuration.events.entities.meta.MetaEco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

/**
 * Created by Lukasz S. on 12.04.2017.
 */

@Component
public class DataLoader implements ApplicationRunner {

    private MetaEcoRepository metaEcoRepository;

    @Autowired
    private ResourceLoader resourceLoader;

    @Autowired
    public DataLoader(MetaEcoRepository metaEcoRepository) {
        this.metaEcoRepository = metaEcoRepository;
    }

    public void run(ApplicationArguments args) {
        metaEcoRepository.save(new MetaEco(1,"dupa id=1"));
    }
}
