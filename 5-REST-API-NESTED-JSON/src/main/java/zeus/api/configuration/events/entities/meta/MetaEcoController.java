package zeus.api.configuration.events.entities.meta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Lukasz S. on 05.04.2017.
 */
@RestController
public class MetaEcoController {

    @Autowired
    MetaEcoService metaEco;

    @RequestMapping(value = "/eco_config_meta", method = RequestMethod.GET)
    public List<MetaEco> getAllConfigurations(){
        return metaEco.getAllConfigurations();
    }

//    @RequestMapping(value = "/topic/{topicId}/courses/{courseId}", method = RequestMethod.GET)
//    public Configuration getConfigurationById(@PathVariable long courseId){
//        return repositoryCourse.getConfigurationById(courseId);
//    }

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
