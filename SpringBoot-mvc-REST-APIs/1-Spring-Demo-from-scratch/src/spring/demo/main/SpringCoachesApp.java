package spring.demo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.demo.coaches.coach.CricketCoach;

/**
 * Created by Łukasz Sroczyński on 23.03.2017.
 */
public class SpringCoachesApp {
    public static void main(String[] args) {

        // 1. Load the Spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring/demo/config/applicationContext.xml");

        // 2. Retrieve bean from Spring-Container
        CricketCoach theCoach = context.getBean("myCoach", CricketCoach.class); // coach.class gives us: interface spring.demo.coaches.interfaces.coach

        // 3. Call Methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        // 4. Close the context
        context.close();
    }
}
