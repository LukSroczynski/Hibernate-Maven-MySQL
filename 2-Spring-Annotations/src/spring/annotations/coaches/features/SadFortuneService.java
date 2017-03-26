package spring.annotations.coaches.features;

import spring.annotations.coaches.interfaces.BaseFortuneService;

/**
 * Created by Surreallistic on 25.03.2017.
 */
public class SadFortuneService implements BaseFortuneService{

    @Override
    public String getFortune() {
        return "sad fortune";
    }
}
