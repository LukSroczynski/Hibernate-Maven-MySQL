package zeus.api.configuration.events.domain.events;

import zeus.api.configuration.events.domain.events.interfaces.BrakeRepository;
import zeus.api.configuration.events.domain.events.interfaces.RmpRepository;
import zeus.api.configuration.events.domain.events.interfaces.SpeedRepository;
import zeus.api.configuration.events.entities.events.Brake;
import zeus.api.configuration.events.entities.events.Rpm;
import zeus.api.configuration.events.entities.events.Speed;
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

    public List<Rpm> getEventRMP(){
        List<Rpm> list = new ArrayList<>();
        rmpRepository.findAll()
                .forEach(list::add);
        return list;
    }

    public List<Speed> getEventSpeed(){
        List<Speed> list = new ArrayList<>();
        speedRepository.findAll()
                .forEach(list::add);
        return list;
    }

    public void addEvent(Brake brake) {
        brakeRepository.save(brake);
    }

    public void addEvent(Rpm rpm) {
        rmpRepository.save(rpm);
    }

    public void addEvent(Speed speed) {
        speedRepository.save(speed);
    }

    public void updateEvent(Brake brake) {
        brakeRepository.save(brake);
    }

    public void updateEvent(Rpm rpm) {
        rmpRepository.save(rpm);
    }

    public void updateEvent(Speed speed) {
        speedRepository.save(speed);
    }

}
