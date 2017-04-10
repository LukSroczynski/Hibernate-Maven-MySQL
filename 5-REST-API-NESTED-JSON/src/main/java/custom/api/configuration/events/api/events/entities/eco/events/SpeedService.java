package custom.api.configuration.events.api.events.entities.eco.events;

import custom.api.configuration.events.api.events.entities.eco.events.Speed;
import custom.api.configuration.events.api.events.entities.eco.events.SpeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lukasz S. on 07.04.2017.
 */

@Service
public class SpeedService {

    @Autowired
    SpeedRepository repository;

    public List<Speed> getEvent(){
        List<Speed> list = new ArrayList<>();
        repository.findAll().forEach(list::add);
        return list;
    }

    public void addEvent(Speed speed) {
        repository.save(speed);
    }

    public void updateEvent(Speed speed) {
        repository.save(speed);
    }

}
