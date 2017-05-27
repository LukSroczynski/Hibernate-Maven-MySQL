package spring.annotations.coaches.implementations;

import org.springframework.beans.factory.annotation.Value;
import spring.annotations.coaches.interfaces.BaseFortuneService;
import spring.annotations.coaches.interfaces.Coach;

/**
 * Created by Surreallistic on 25.03.2017.
 */
public class SwimCoach implements Coach {

    private BaseFortuneService baseFortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public SwimCoach(BaseFortuneService baseFortuneService) {
        this.baseFortuneService = baseFortuneService;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000m";
    }

    @Override
    public String getDailyFortune() {
        return baseFortuneService.getFortune();
    }

    @Override
    public String getRandomFortune() {
        return null;
    }
}
