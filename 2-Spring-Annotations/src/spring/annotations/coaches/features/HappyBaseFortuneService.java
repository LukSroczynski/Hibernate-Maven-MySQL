package spring.annotations.coaches.features;

import org.springframework.stereotype.Component;
import spring.annotations.coaches.interfaces.BaseFortuneService;

/**
 * Created by Surreallistic on 25.03.2017.
 */

@Component
public class HappyBaseFortuneService implements BaseFortuneService {

    @Override
    public String getFortune() {
        return "You won cash in Lotto! Congrats";
    }
}
