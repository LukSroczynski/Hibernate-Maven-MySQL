package spring.demo.coaches;

/**
 * Created by Łukasz Sroczyński on 24.03.2017.
 */
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is you lucky day!";
    }
}
