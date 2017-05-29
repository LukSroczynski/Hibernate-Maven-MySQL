package drawning.objects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Lukasz S. on 27.05.2017.
 */
public class DrawningApp {

    public static void main(String[] args) {

        ApplicationContext spring_core_context = new ClassPathXmlApplicationContext("spring_core_objects.xml");
        Triangle triangle = (Triangle) spring_core_context.getBean("triangle"); // We have to cast it because it is an object
        triangle.draw();

    }
}
