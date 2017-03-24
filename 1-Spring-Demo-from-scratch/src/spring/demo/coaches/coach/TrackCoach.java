package spring.demo.coaches.coach;

import spring.demo.coaches.interfaces.Coach;
import spring.demo.coaches.interfaces.FortuneService;

/**
 * Created by Łukasz Sroczyński on 23.03.2017.
 */
public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {

    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    /**
     *  init method
     */
    void doAtStartup() {
        System.out.println("TrackCoach: doAtStartup");
    }

    /**
     *  Destroy method
     */
    void doAtDestroy() {
        System.out.println("TrackCoach: doAtDestroy");
    }
}
