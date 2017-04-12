package custom.api.configuration.events.domain;


import custom.api.configuration.events.domain.crud.interfaces.RmpRepository;
import custom.api.configuration.events.entities.events.Brake;
import custom.api.configuration.events.entities.events.Rpm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lukasz S. on 07.04.2017.
 */

@Service
public class RpmService {

    @Autowired
    RmpRepository repository;

    public List<Rpm> getEvent(){
        List<Rpm> list = new ArrayList<>();
        repository.findAll()
                .forEach(list::add);
        return list;
    }

    public void addEvent(Rpm rpm) {
        repository.save(rpm);
    }

    public void updateEvent(Rpm rpm) {
        repository.save(rpm);
    }

}
