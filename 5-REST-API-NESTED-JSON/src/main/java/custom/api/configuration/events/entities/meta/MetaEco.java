package custom.api.configuration.events.entities.meta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
    String FactorName;
    String ValMiano;

}
