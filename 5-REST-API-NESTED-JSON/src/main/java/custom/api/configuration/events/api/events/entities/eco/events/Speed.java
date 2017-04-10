package custom.api.configuration.events.api.events.entities.eco.events;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Lukasz S. on 30.03.2017.
 */

@Entity
@Data
public class Speed implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id ;
    private String name;

    public Speed(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Speed(String name) {
        this.name = name;
    }

    public Speed() {
    }


}





