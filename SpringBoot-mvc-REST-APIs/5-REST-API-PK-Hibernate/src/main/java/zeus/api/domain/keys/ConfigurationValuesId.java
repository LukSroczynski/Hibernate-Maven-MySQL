package zeus.api.domain.keys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by Lukasz S. on 30.03.2017.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ConfigurationValuesId implements Serializable{

    private long id_config;
    private long id_meta_data_def_eco_events;

}





