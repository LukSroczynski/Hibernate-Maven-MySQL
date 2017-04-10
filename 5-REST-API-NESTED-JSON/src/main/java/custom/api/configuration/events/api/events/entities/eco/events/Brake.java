package custom.api.configuration.events.api.events.entities.eco.events;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Lukasz S. on 30.03.2017.
 */

@Entity
@Data
public class Brake implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id ;
    String name;

    public Brake(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Brake(String name) {
        this.name = name;
    }

    public Brake() {
    }


}





