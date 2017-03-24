package spring.annotations.coaches;

import org.springframework.stereotype.Component;
import spring.annotations.coaches.interfaces.Coach;

/**
 * Created by Łukasz Sroczyński on 24.03.2017.
 */

@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your back-hand volly.";
    }

}
