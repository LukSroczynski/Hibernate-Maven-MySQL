package spring.annotations.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.annotations.coaches.interfaces.Coach;

/**
 * Created by Łukasz Sroczyński on 24.03.2017.
 */
public class AnnotationApp {
    public static void main(String[] args) {

        // 1. Read Spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. Get the Bean from Spring-Container
        Coach coach = context.getBean("tennisCoach", Coach.class);

        // 3. Call a method on the Bean
        System.out.println(coach.getDailyWorkout());

        // 4. Close the Context
        context.close();

    }
}
