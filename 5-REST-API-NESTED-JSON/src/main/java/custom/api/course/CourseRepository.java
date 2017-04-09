package custom.api.course;


import custom.api.topic.Topic;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Lukasz S. on 05.04.2017.
 */
public interface CourseRepository extends CrudRepository<Course, Long> {

    List<Course> findByTopicId(long topicId);
}