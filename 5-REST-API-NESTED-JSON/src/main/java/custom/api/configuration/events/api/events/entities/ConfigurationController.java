package custom.api.configuration.events.api.events.entities;

import custom.api.configuration.events.api.events.entities.eco.events.BrakeService;
import custom.api.configuration.events.api.events.entities.eco.events.SpeedService;
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
    SpeedService repositorySpeed;

    @Autowired
    BrakeService repositoryBrake;

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
        repositorySpeed.addEvent(configuration.getSpeed());
        repositoryBrake.addEvent(configuration.getBrake());
        repositoryCourse.addCourse(configuration);
    }

//    @RequestMapping(value = "/topic/{topicId}/courses/{courseId}", method = RequestMethod.PUT)
//    public void updateCourseById(@RequestBody Configuration configuration, @PathVariable long topicId) {
//        configuration.setSpeed(new Brake( topicId, ""));
//        repositoryCourse.updateCourseById(configuration);
//    }
//
//    @RequestMapping(value = "/topic/{topicId}/courses/{courseId}", method = RequestMethod.DELETE)
//    public void deleteCourseById(@PathVariable long courseId){
//        repositoryCourse.deleteCourseById(courseId);
//    }

}
