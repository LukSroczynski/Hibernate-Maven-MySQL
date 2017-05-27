package spring.annotations.coaches.features;

import org.springframework.stereotype.Component;
import spring.annotations.coaches.interfaces.BaseFortuneService;
import spring.annotations.coaches.interfaces.RandomFortuneService;

import java.util.Random;

/**
 * Created by Surreallistic on 25.03.2017.
 */

@Component
public class RandomBaseFortuneService implements RandomFortuneService {

    private Random randomNumber = new Random();

    private String[] data = {
            "Today is you lucky day!",
            "Ahoy!",
            "Lost in the space!",
            "Ship appeared. Continue.."
    };

    @Override
    public String getFortune() {
        return "You won cash in Lotto! Congrats";
    }

    @Override
    public String getRandomFortune() {
        int index = randomNumber.nextInt(data.length);
        return data[index];
    }
}
