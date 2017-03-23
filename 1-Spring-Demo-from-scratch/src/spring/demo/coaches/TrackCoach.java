package spring.demo.coaches;

/**
 * Created by user on 23.03.2017.
 */
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
}
