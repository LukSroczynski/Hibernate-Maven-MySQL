package custom.api.configuration.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lukasz S. on 07.04.2017.
 */

@Service
public class ConfigurationService {

    @Autowired
    ConfigurationRepository repository;

    public List<Configuration> getAllConfigurations(){
        List<Configuration> list = new ArrayList<>();
        repository.findAll()
                .forEach(list::add);
        return list;
    }

    public Configuration getCoursesById(long id){
        return repository.findOne(id);
    }

    public void addCourse(Configuration configuration) {
        repository.save(configuration);
    }

    public void updateCourseById(Configuration configuration) {
        repository.save(configuration);
    }

    public void deleteCourseById(long id){
        repository.delete(id);
    }
}
