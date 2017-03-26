package spring.annotations.coaches.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring.annotations.coaches.interfaces.BaseFortuneService;
import spring.annotations.coaches.interfaces.PropCoach;
import spring.annotations.coaches.interfaces.RandomFortuneService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Surreallistic on 25.03.2017.
 * Scope when there is default which is singelton then Constructor is called once. When we change it to prototype then It's called twice.
 *
 *  For Bean Inicialization: use @PostConstruct
 *  For Bean Destruction: use @PreDestroy
 *
 *  TIP: For Prototype Scope there is no Destroy method : @PreDestroy
 */

@Component
@Scope("singleton")
public class BaseballCoach implements PropCoach {

    @Autowired
    @Qualifier("randomBaseFortuneService")
    private RandomFortuneService randomBaseFortuneService;

    @Autowired
    @Qualifier("randomBaseFortuneServiceFromFile")
    private RandomFortuneService randomBaseFortuneServiceFromFile;

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

    public BaseballCoach() {
        System.out.println("BaseballCoach Constructor was called.");
    }

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

    @PostConstruct
    public void doInit() {
        System.out.println("Bean has been initialized");
    }

    @PreDestroy
    public void doDestroy() {
        System.out.println("Bean has been destroyed");
    }

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
        return randomBaseFortuneServiceFromFile.getRandomFortune();
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
