package custom.api.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lukasz S. on 07.04.2017.
 */

@Service
public class CourseService {

    @Autowired
    CourseRepository repository;

    public List<Course> getAllCourses(long topicId){
        List<Course> list = new ArrayList<>();
        repository.findByTopicId(topicId)
                .forEach(list::add);
        return list;
    }

    public Course getCoursesById(long id){
        return repository.findOne(id);
    }

    public void addCourse(Course course) {
        repository.save(course);
    }

    public void updateCourseById(Course course) {
        repository.save(course);
    }

    public void deleteCourseById(long id){
        repository.delete(id);
    }
}
