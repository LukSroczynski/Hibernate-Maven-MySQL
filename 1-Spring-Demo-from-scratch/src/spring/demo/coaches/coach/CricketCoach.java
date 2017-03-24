package spring.demo.coaches.coach;

import spring.demo.coaches.interfaces.Coach;
import spring.demo.coaches.interfaces.FortuneService;

/**
 * Created by Łukasz Sroczyński on 24.03.2017.
 */
public class CricketCoach implements Coach {

    private FortuneService fortuneService1;
    private String emailAddress;
    private String team;

    // non-arg constructor - it's actually made by Java as a Default - you don't need to create it
    public CricketCoach() {
        System.out.println("CricketCoach: inside non-arg constructor");
    }

    public void setFortuneService1(FortuneService fortuneService1) {
        System.out.println("CricketCoach: inside setFortuneService1");
        this.fortuneService1 = fortuneService1;
    }

    @Override
    public String getDailyWorkout() {
        return "Practive fast bowling for 15min.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService1.getFortune();
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }
}
