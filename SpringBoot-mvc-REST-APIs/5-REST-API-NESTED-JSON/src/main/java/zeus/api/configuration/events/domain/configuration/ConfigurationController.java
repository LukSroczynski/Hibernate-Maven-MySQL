package zeus.api.configuration.events.domain.configuration;

import zeus.api.configuration.events.domain.events.EventServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Lukasz S. on 05.04.2017.
 */
@RestController
public class ConfigurationController {

    @Autowired
    ConfigurationService repositoryCourse;

    @Autowired
    EventServices eventServices;

    @RequestMapping(value = "/configs", method = RequestMethod.GET)
    public List<Configuration> getAllConfigurations(){
        return repositoryCourse.getAllConfigurations();
    }

//    @RequestMapping(value = "/topic/{topicId}/courses/{courseId}", method = RequestMethod.GET)
//    public Configuration getCoursesById(@PathVariable long courseId){
//        return repositoryCourse.getCoursesById(courseId);
//    }

    @RequestMapping(value = "/configs", method = RequestMethod.POST)
    public void addCourse(@RequestBody Configuration configuration) {
        eventServices.addEvent(configuration.getSpeed());
        eventServices.addEvent(configuration.getBrake());
        eventServices.addEvent(configuration.getRpm());
        repositoryCourse.addCourse(configuration);
    }

    @RequestMapping(value = "/configs", method = RequestMethod.PUT)
    public void updateCourseById(@RequestBody Configuration configuration) {
        eventServices.addEvent(configuration.getSpeed());
        eventServices.addEvent(configuration.getBrake());
        eventServices.addEvent(configuration.getRpm());
        repositoryCourse.updateConfiguration(configuration);
    }
//
//    @RequestMapping(value = "/topic/{topicId}/courses/{courseId}", method = RequestMethod.DELETE)
//    public void deleteCourseById(@PathVariable long courseId){
//        repositoryCourse.deleteCourseById(courseId);
//    }

}
