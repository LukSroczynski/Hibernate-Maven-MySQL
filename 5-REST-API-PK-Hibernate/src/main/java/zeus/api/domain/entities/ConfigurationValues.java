package zeus.api.domain.entities;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.*;
import zeus.api.domain.keys.ConfigurationValuesId;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by Lukasz S. on 30.03.2017.
 */

@Entity
@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigurationValues {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private ConfigurationValuesId compositeId;

    private String Activation;

    public ConfigurationValues(ConfigurationValuesId id, String activation) {
        this.compositeId = id;
        Activation = activation;
    }

    public ConfigurationValues() {
    }
}