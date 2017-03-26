package spring.annotations.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.annotations.coaches.interfaces.Coach;

/**
 * Created by Surreallistic on 25.03.2017.
 */
public class BeanAnnotationScopeApp {
    public static void main(String[] args) {

        // 1. Load Spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("configuration/applicationContext.xml");
        // 2. Retrieve bean from Spring-Container
        Coach coach1 = context.getBean("baseballCoach", Coach.class);
        Coach coach2 = context.getBean("baseballCoach", Coach.class);

        // 3. Check if the Coaches are the same
        boolean result = coach1 == coach2;

        // 4. Print result
        System.out.println("Pointing to the same object: " + result);

        System.out.println("Memory location coach1: " + coach1);
        System.out.println("Memory location coach2: " + coach2);

        //5. Close Spring Application-Context
        context.close();

    }
}
