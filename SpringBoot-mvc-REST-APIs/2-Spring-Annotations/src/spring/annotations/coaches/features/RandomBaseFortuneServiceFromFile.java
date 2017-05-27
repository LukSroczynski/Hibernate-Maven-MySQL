package spring.annotations.coaches.features;

import org.springframework.stereotype.Component;
import spring.annotations.coaches.interfaces.BaseFortuneService;
import spring.annotations.coaches.interfaces.RandomFortuneService;
import spring.annotations.file.reader.FileReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Surreallistic on 25.03.2017.
 */

@Component
public class RandomBaseFortuneServiceFromFile implements RandomFortuneService {

    private Random randomNumber = new Random();
    private List<String> data = new ArrayList<>();

    @Override
    public String getFortune() {
        return "You won cash in Lotto! Congrats";
    }

    @Override
    public String getRandomFortune() {
        FileReader readFile = new FileReader("src\\data\\quotes.txt");
        data.addAll(readFile.getCollectionOfLines());
        return data.get(randomNumber.nextInt(data.size()));
    }
}
