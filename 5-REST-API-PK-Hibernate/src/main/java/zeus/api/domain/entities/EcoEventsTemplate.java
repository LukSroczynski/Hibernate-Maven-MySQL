package zeus.api.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Lukasz S. on 25.04.2017.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EcoEventsTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String Activation;
    private String TrigBVal;
}
