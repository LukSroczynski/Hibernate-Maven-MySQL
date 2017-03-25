package spring.annotations.coaches;

import org.springframework.stereotype.Component;
import spring.annotations.coaches.interfaces.Coach;

/**
 * Created by Surreallistic on 25.03.2017.
 */

@Component
public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Run for 2h";
    }
}
