package spring.demo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.demo.coaches.coach.CricketCoach;
import spring.demo.coaches.interfaces.Coach;

/**
 * Created by Łukasz Sroczyński on 24.03.2017.
 */
public class BeanScopeApp {
    public static void main(String[] args) {

        // 1. Load the Spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring/demo/config/beanScope-applicationContext.xml");

        // 2. Retrieve bean from Spring-Container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // 3. Call Methods on the bean
        boolean result = (theCoach == alphaCoach);

        System.out.println("Is object the same: " + result);

        System.out.println("Memory Location for theCoach:  " + theCoach);

        System.out.println("Memory Location for alphaCoach:  " + alphaCoach);

        // 4. Close the context
        context.close();

    }
}
