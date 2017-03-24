package spring.demo.coaches.featues;

import spring.demo.coaches.interfaces.FortuneService;

import java.util.Random;

/**
 * Created by Łukasz Sroczyński on 24.03.2017.
 */
public class HappyFortuneService implements FortuneService {

    private Random randomNumber = new Random();

    private String[] data = {
            "Today is you lucky day!",
            "You lucky bastard!",
            "Lost in the space!"
    };

    @Override
    public String getFortune() {
        int index = randomNumber.nextInt(data.length);
        System.out.println("Your lucky number = " + index);
        return data[index];
    }
}
