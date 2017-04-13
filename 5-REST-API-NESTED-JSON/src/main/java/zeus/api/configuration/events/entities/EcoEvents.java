package zeus.api.configuration.events.entities;

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
    String TrigBActivate;
    String TrigBValDelay;
    String TrigBDelayTime;
    String TrigBDelayActivate;
    String TrigBValOcur;
    String TrigBOcurNumb;
    String TrigBOcurActivate;
    String BSignificant;
    String TrigAVal;
    String TrigAActivate;
    String TrigAValDelay;
    String TrigADelayTime;
    String TrigADelayActivate;
    String TrigAValOcur;
    String TrigAOcurNumb;
    String TrigAOcurActivate;
    String ASignificant;
    String TrigEValMin;
    String TrigEValMax;
    String TrigEDelayTime;
    String TrigEActivate;
    String ESignificant;
    String TrigAuxVal;
    String ConnectedFactors;

}
