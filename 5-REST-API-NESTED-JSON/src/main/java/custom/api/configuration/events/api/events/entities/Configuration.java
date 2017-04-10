package custom.api.configuration.events.api.events.entities;

import custom.api.configuration.events.api.events.entities.eco.events.Speed;
import custom.api.configuration.events.api.events.entities.eco.events.Brake;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Lukasz S. on 30.03.2017.
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Configuration implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id ;
    private String name;

    @ManyToOne
    private Speed speed;
    @ManyToOne
    private Brake brake;

    public Configuration(String name, long topicId) {
        this.name = name;
        this.speed = new Speed(topicId, "");
        this.brake = new Brake(topicId, "");
    }
}





