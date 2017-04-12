package custom.api.configuration.events.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by Lukasz S. on 11.04.2017.
 */

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class EcoEvents {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private long id ;
//    String FactorName;
//    String ValMiano;
    String ValRange;
    String ValStep;
    String AuxValName;
    String AuxValMiano;
    String AuxValRange;
    String AuxValStep;
    String TimeRange;
    String AuxActivate;
    String Activation;
    String TrigBVal;
    String TrigBValDelay;
    String TrigBDelayTime;
    String TrigBActivate;
    String TrigBDelayActivate;
    String TrigAVal;
    String TrigAValDelay;
    String TrigADelayTime;
    String TrigAActivate;
    String TrigADelayActivate;
    String TrigAuxVal;
    String ConnectedFactors;

}
