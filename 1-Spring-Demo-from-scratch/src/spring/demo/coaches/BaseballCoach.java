package spring.demo.coaches;

/**
 * Created by Łukasz Sroczyński on 23.03.2017.
 */
public class BaseballCoach implements Coach{

    // Definied a private field for Dependency
    private FortuneService fortuneService;

    // Define a constructor for Dependency Injection
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public BaseballCoach() {

    }

    @Override
    public String getDailyWorkout() {
        return "Make FBW on gym. Also add running for 30min";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
