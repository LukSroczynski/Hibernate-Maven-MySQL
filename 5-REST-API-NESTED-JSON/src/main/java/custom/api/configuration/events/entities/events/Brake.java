package custom.api.configuration.events.entities.events;


import custom.api.configuration.events.entities.EcoEvents;
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
public class Brake extends EcoEvents{
}
