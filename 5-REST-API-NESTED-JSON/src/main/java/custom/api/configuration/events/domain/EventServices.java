package custom.api.configuration.events.domain;

import custom.api.configuration.events.domain.crud.interfaces.BrakeRepository;
import custom.api.configuration.events.domain.crud.interfaces.RmpRepository;
import custom.api.configuration.events.domain.crud.interfaces.SpeedRepository;
import custom.api.configuration.events.entities.events.Brake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lukasz S. on 07.04.2017.
 */

@Service
public class EventServices {

    @Autowired
    BrakeRepository brakeRepository;

    @Autowired
    RmpRepository rmpRepository;

    @Autowired
    SpeedRepository speedRepository;

    public List<Brake> getEventBrake(){
        List<Brake> list = new ArrayList<>();
        brakeRepository.findAll()
                .forEach(list::add);
        return list;
    }

    public void addEventBrake(Brake brake) {
        brakeRepository.save(brake);
    }

    public void updateEventBrake(Brake brake) {
        brakeRepository.save(brake);
    }

}
