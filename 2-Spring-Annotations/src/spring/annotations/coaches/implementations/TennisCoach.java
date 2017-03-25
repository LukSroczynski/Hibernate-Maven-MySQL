package spring.annotations.coaches.implementations;

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

    @Override
    public String getDailyFortune() {
        return null;
    }

    @Override
    public String getRandomFortune() {
        return null;
    }

}
