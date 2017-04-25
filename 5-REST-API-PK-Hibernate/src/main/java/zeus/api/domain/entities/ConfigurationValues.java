package zeus.api.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import zeus.api.domain.keys.ConfigurationValuesId;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Lukasz S. on 30.03.2017.
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigurationValues {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private ConfigurationValuesId id;

    private String Activation;
    private String TrigBVal;

}





