package spring.demo.coaches;

/**
 * Created by user on 23.03.2017.
 */
public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Make FBW on gym. Also add running for 30min";
    }
}
