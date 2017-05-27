package zeus.api.configuration.events.entities.meta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lukasz S. on 07.04.2017.
 */

@Service
public class MetaEcoService {

    @Autowired
    MetaEcoRepository metaEcoRepository;

    public List<MetaEco> getAllConfigurations(){
        List<MetaEco> list = new ArrayList<>();
        metaEcoRepository.findAll()
                .forEach(list::add);
        return list;
    }
}
