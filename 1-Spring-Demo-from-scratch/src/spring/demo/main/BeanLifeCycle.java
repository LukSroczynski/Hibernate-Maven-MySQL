package spring.demo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.demo.coaches.coach.CricketCoach;
import spring.demo.coaches.interfaces.Coach;

/**
 * Created by Łukasz Sroczyński on 24.03.2017.
 */
public class BeanLifeCycle {
    public static void main(String[] args) {

        // 1. Load the Spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring/demo/config/BeanLifeCycle-init-destroy-applicationContext.xml");

        // 2. Retrieve bean from Spring-Container
        Coach theCoach = context.getBean("myCoach", Coach.class); // coach.class gives us: interface spring.demo.coaches.interfaces.coach

        // 3. Call Methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // 4. Close the context
        context.close();

    }
}
