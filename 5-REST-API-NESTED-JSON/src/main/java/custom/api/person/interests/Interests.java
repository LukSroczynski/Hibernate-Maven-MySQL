package custom.api.person.interests;

import custom.api.person.Person;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Lukasz S. on 30.03.2017.
 */
@Entity
public class Interests implements Serializable{

    @Id
    private String id;

    @Column(name="computer")
    private long computer ;

    @Column(name="gaming")
    private String gaming;

    @ManyToOne
    private Person person;

    public Interests() {
    }

    public Interests(String id, long computer, String gaming, long personId) {
        this.id = id;
        this.computer = computer;
        this.gaming = gaming;
        this.person = new Person(personId, "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getComputer() {
        return computer;
    }

    public void setComputer(long computer) {
        this.computer = computer;
    }

    public String getGaming() {
        return gaming;
    }

    public void setGaming(String gaming) {
        this.gaming = gaming;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Interests{" +
                "id='" + id + '\'' +
                ", computer=" + computer +
                ", gaming='" + gaming + '\'' +
                ", person=" + person +
                '}';
    }
}





