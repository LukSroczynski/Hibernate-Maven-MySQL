package spring.demo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.demo.coaches.Coach;

/**
 * Created by Łukasz Sroczyński on 23.03.2017.
 */
public class SpringCoachesApp {
    public static void main(String[] args) {

        // 1. Load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. Retrieve bean from Spring-Container
        Coach theCoach = context.getBean("myCoach", Coach.class); // Coach.class gives us: interface spring.demo.coaches.Coach

        // 3. Call Methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // Call new method made in FortunesService
        System.out.println(theCoach.getDailyFortune());

        // 4. Close the context
        context.close();

    }
}
