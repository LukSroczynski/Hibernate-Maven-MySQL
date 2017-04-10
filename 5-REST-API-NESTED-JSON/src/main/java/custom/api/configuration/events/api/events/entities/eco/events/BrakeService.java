package custom.api.configuration.events.api.events.entities.eco.events;

import custom.api.configuration.events.api.events.entities.eco.events.Brake;
import custom.api.configuration.events.api.events.entities.eco.events.BrakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lukasz S. on 07.04.2017.
 */

@Service
public class BrakeService {

    @Autowired
    BrakeRepository repository;

    public List<Brake> getEvent(){
        List<Brake> list = new ArrayList<>();
        repository.findAll()
                .forEach(list::add);
        return list;
    }

    public void addEvent(Brake brake) {
        repository.save(brake);
    }

    public void updateEvent(Brake brake) {
        repository.save(brake);
    }

}
