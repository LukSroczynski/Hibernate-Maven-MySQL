package spring.annotations.main;

import configuration.ConfigurationViaClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.annotations.coaches.implementations.SwimCoach;
import spring.annotations.coaches.interfaces.Coach;
import spring.annotations.coaches.interfaces.PropCoach;

/**
 * Created by Łukasz Sroczyński on 24.03.2017.
 */
public class JavaConfigApp {
    public static void main(String[] args) {

        // 1. Read Spring configuration file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigurationViaClass.class);

        // 2. Get the Bean from Spring-Container
        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

        // 3. Call a method on the Bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getTeam());
        System.out.println(coach.getEmail());

        // 4. Close the Context
        context.close();

    }
}


