package custom.api.configuration.events.domain;

import custom.api.configuration.events.domain.crud.interfaces.SpeedRepository;
import custom.api.configuration.events.entities.events.Speed;
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
