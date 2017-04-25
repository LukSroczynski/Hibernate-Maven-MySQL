package zeus.api.domain.entities;

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
public class MetaDataDefEcoEvents {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String FactorName;
    private String ValMiano;
    private String ValRange;
    private String ValStep;
    private String AuxValName;
    private String AuxValMiano;
    private String AuxValRange;
    private String AuxValStep;
    private String TimeRange;
    private String AuxActivate;
    private String Description;
}
