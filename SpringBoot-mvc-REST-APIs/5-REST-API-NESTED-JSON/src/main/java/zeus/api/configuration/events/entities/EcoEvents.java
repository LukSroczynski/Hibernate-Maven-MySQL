package zeus.api.configuration.events.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by Lukasz S. on 11.04.2017.
 */

@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class EcoEvents {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id ;
    String boom;
    String crash;
    String other;
}
