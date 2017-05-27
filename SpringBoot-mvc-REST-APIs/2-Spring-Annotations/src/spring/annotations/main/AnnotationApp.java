package spring.annotations.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.annotations.coaches.interfaces.Coach;
import spring.annotations.coaches.interfaces.PropCoach;

/**
 * Created by Łukasz Sroczyński on 24.03.2017.
 */
public class AnnotationApp {
    public static void main(String[] args) {

        // 1. Read Spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("configuration/applicationContext.xml");

        // 2. Get the Bean from Spring-Container
        PropCoach coach = context.getBean("baseballCoach", PropCoach.class);

        // 3. Call a method on the Bean
//        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
//
//        System.out.println(coach.getEmail());
//        System.out.println(coach.getTeam());

        System.out.println(coach.getDailyWorkout());

        // 4. Close the Context
        context.close();

    }
}


