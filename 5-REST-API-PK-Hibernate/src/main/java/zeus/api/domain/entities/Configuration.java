package zeus.api.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by Lukasz S. on 30.03.2017.
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Configuration {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @XmlAttribute(required = true)
    private long id ;

    @XmlAttribute (required = true)
    private String name;

    private Date created;

    private Date last_updated;

    @PrePersist
    protected void onCreate() {
        created = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        last_updated = new Date();
    }

}





