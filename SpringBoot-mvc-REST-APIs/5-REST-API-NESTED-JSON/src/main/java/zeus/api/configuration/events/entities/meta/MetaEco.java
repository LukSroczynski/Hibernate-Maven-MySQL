package zeus.api.configuration.events.entities.meta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Lukasz S. on 30.03.2017.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MetaEco {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String FactorName;
    private String ValMiano;
    private String description;
}
