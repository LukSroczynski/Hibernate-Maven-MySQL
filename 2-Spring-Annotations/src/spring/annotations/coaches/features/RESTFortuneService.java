package spring.annotations.coaches.features;

import org.springframework.stereotype.Component;
import spring.annotations.coaches.interfaces.BaseFortuneService;

/**
 * Created by Surreallistic on 25.03.2017.
 * When we have UPPER-CASE class name then threre is no conversion for the bean - so bean name is: RESTFortuneService not rESTFortuneService or something
 */

@Component
public class RESTFortuneService implements BaseFortuneService{

    @Override
    public String getFortune() {
        return "UPPER CASE FORTUNE ";
    }
}

