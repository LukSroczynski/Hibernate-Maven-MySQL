package drawning.objects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Lukasz S. on 27.05.2017.
 */
public class DrawningApp {

    public static void main(String[] args) {

        /**
         * As Default ApplicationContext initialize all the beans and store than inside itself.
         * We can configure that so bean is initialize when getBean() is called.
         */

        /*
        // XML file - is a Blueprint
        ApplicationContext spring_core_context = new ClassPathXmlApplicationContext("spring_core_objects.xml");

        // We have to cast it because it is an object
        Triangle triangle = (Triangle) spring_core_context.getBean("triangle2");
        triangle.draw();
        */

        AbstractApplicationContext spring_core_context = new ClassPathXmlApplicationContext("spring_core_objects.xml");
        spring_core_context.registerShutdownHook();

        Triangle triangle = (Triangle) spring_core_context.getBean("triangle2");
        triangle.draw();

    }
}
