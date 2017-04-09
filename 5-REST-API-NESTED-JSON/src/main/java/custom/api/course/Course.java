package custom.api.course;

import custom.api.topic.Topic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Lukasz S. on 30.03.2017.
 */

@Entity
@Data
public class Course implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id ;
    private String name;
    @ManyToOne
    private Topic topic;

    public Course(String name, long topicId) {
        this.name = name;
        this.topic = new Topic(topicId, "");
    }

    public Course() {
    }
}





