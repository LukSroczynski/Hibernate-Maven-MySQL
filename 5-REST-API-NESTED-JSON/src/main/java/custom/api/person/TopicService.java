package custom.api.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lukasz S. on 07.04.2017.
 */

@Service
public class TopicService {

    @Autowired
    TopicRepository repository;

    public List<Topic> getAllTopics(){
        List<Topic> list = new ArrayList<>();
        repository.findAll().forEach(list::add);
        return list;
    }

    public Topic getTopicsById(long id){
        return repository.findOne(id);
    }

    public void addTopic(Topic topic) {
        repository.save(topic);
    }

    public void updateTopicById(long id, Topic topic) {
        repository.save(topic);
    }

    public void deleteTopicById(long id){
        repository.delete(id);
    }
}
