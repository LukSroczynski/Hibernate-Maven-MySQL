package springbootstarter.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Lukasz S. on 31.03.2017.
 */

@RestController
public class TopicController {

    @RequestMapping(value = "/topics", method = RequestMethod.GET)
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("1", "Topic first", "ssfghgfhgfhgfhgfss"),
                new Topic("2", "", "shgfhgfhgfhgfhgfsss"),
                new Topic("2", "13452345", "shgfhgfhgfhgfhgfsss"),
                new Topic("5", "34gfd", "xxxx"),
                new Topic("3", "kkjkjkjkjkjkjkjk", "shgfhgfhgfhgfhgfhsss")
        );
    }


}
