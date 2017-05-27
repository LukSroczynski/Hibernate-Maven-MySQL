package zeus.api.configuration.events.domain.configuration;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Persistent;
import zeus.api.configuration.events.entities.events.Rpm;
import zeus.api.configuration.events.entities.events.Speed;
import zeus.api.configuration.events.entities.events.Brake;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Lukasz S. on 30.03.2017.
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Configuration {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id ;
    private String name;

    private Date created;

    private Date updated;

    @PrePersist
    protected void onCreate() {
        created = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        updated = new Date();
    }

    @ManyToOne
    private Speed speed;

    @ManyToOne
    private Brake brake;

    @ManyToOne
    private Rpm rpm;

    public Configuration(String name) {
        this.name = name;
        this.speed = new Speed();
        this.brake = new Brake();
        this.rpm = new Rpm();
    }
}





