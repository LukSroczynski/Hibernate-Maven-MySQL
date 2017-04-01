package jpa.rest.api.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Surreallistic on 31.03.2017.
 *
 * Bussines Service are singleton
 *
 */

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("1", "Topic first", "ssfghgfhgfhgfhgfss"),
            new Topic("2", "", "shgfhgfhgfhgfhgfsss"),
            new Topic("2", "13452345", "shgfhgfhgfhgfhgfsss"),
            new Topic("5", "34gfd", "xxxx"),
            new Topic("3", "kkjkjkjkjkjkjkjk", "shgfhgfhgfhgfhgfhsss")));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        for(int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if(t.getId().equals(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }

}