package custom.api.course;

import custom.api.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Lukasz S. on 05.04.2017.
 */
@RestController
public class CourseController {

    @Autowired
    CourseService repository;

    @RequestMapping(value = "/topic/{id}/courses", method = RequestMethod.GET)
    public List<Course> getAllCourses(@PathVariable long id){
        return repository.getAllCourses(id);
    }

    @RequestMapping(value = "/topic/{topicId}/courses/{courseId}", method = RequestMethod.GET)
    public Course getCoursesById(@PathVariable long courseId){
        return repository.getCoursesById(courseId);
    }

    @RequestMapping(value = "/topic/{topicId}/courses", method = RequestMethod.POST)
    public void addCourse(@RequestBody Course course, @PathVariable long topicId) {
        course.setTopic(new Topic( topicId, ""));
        repository.addCourse(course);
    }

    @RequestMapping(value = "/topic/{topicId}/courses/{courseId}", method = RequestMethod.PUT)
    public void updateCourseById(@RequestBody Course course, @PathVariable long topicId) {
        course.setTopic(new Topic( topicId, ""));
        repository.updateCourseById(course);
    }

    @RequestMapping(value = "/topic/{topicId}/courses/{courseId}", method = RequestMethod.DELETE)
    public void deleteCourseById(@PathVariable long courseId){
        repository.deleteCourseById(courseId);
    }

}
