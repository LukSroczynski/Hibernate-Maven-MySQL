package zeus.api.configuration.spring.configs;

import zeus.api.configuration.events.entities.meta.MetaEco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import zeus.api.configuration.events.entities.meta.MetaEcoRepository;

/**
 * Created by Lukasz S. on 12.04.2017.
 */

@Component
public class MetaDataLoader implements ApplicationRunner {

    private MetaEcoRepository metaEcoRepository;

    @Autowired
    private ResourceLoader resourceLoader;

    @Autowired
    public MetaDataLoader(MetaEcoRepository metaEcoRepository) {
        this.metaEcoRepository = metaEcoRepository;
    }

    public void run(ApplicationArguments args) {
        metaEcoRepository.save(new MetaEco(
                1,
                "Speed",
                "km/h",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
        ));

        metaEcoRepository.save(new MetaEco(
                2,
                "Brake",
                "km/h",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
        ));

        metaEcoRepository.save(new MetaEco(
                3,
                "RPM",
                "rpm",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
        ));
        metaEcoRepository.save(new MetaEco(
                4,
                "Engine_Torque_global",
                "%",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
        ));
        metaEcoRepository.save(new MetaEco(
                5,
                "Engine_Torque_n",
                "%",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
        ));
        metaEcoRepository.save(new MetaEco(
                6,
                "Fuel_Rate",
                "l//h",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
        ));
        metaEcoRepository.save(new MetaEco(
                7,
                "Acceleration_Pedal",
                "%",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
        ));
        metaEcoRepository.save(new MetaEco(
                8,
                "Acceleration_Pedal_Delta",
                "%/s",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
        ));
        metaEcoRepository.save(new MetaEco(
                9,
                "Parking_RPM",
                "rpm",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
        ));
        metaEcoRepository.save(new MetaEco(
                10,
                "Acceleration",
                "g",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
        ));
        metaEcoRepository.save(new MetaEco(
                11,
                "ABS",
                "g",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
        ));
        metaEcoRepository.save(new MetaEco(
                12,
                "ESP",
                "g",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
        ));
    }
}
