package spring.annotations.coaches.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import spring.annotations.coaches.interfaces.BaseFortuneService;
import spring.annotations.coaches.interfaces.Coach;
import spring.annotations.coaches.interfaces.PropCoach;
import spring.annotations.coaches.interfaces.RandomFortuneService;

/**
 * Created by Surreallistic on 25.03.2017.
 */

@Component
public class BaseballCoach implements PropCoach {

    @Autowired
    @Qualifier("randomBaseFortuneService")
    private RandomFortuneService randomBaseFortuneService;

    @Autowired
    @Qualifier("happyBaseFortuneService")
    private BaseFortuneService happyBaseFortuneService;

    @Autowired
    @Qualifier("RESTFortuneService")
    private BaseFortuneService RESTFortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}}")
    private String team;

    // Spring will Scan for components that implements BaseFortuneService interface

    /*------------------------------------------------------------------------------------------------------------------
    @Autowired
    public BaseballCoach(BaseFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */

    /*
    @Autowired
    public void setFortuneService(BaseFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */

    /*
    @Autowired
    public void makeFortune(BaseFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    ------------------------------------------------------------------------------------------------------------------*/

    @Override
    public String getDailyWorkout() {
        return "Run for 2h";
    }

    @Override
    public String getDailyFortune() {
        return RESTFortuneService.getFortune();
    }

    @Override
    public String getRandomFortune() {
        return randomBaseFortuneService.getRandomFortune();
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getTeam() {
        return team;
    }
}
