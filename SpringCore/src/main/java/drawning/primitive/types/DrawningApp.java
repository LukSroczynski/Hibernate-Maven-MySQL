package drawning.primitive.types;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Lukasz S. on 27.05.2017.
 */
public class DrawningApp {

    public static void main(String[] args) {

//        Triangle triangle = new Triangle();

        ApplicationContext spring_core_context = new ClassPathXmlApplicationContext("spring_core_primitive_types.xml");

        Triangle triangleWithoutHeight = (Triangle) spring_core_context.getBean("triangleWithoutHeight"); // We have to cast it because it is an object
        Triangle triangleWithHeight = (Triangle) spring_core_context.getBean("triangleWithHeight"); // We have to cast it because it is an object

        triangleWithoutHeight.drawWithoutHeight();
        triangleWithoutHeight.drawWithHeight();

        System.out.println();

        triangleWithHeight.drawWithoutHeight();
        triangleWithHeight.drawWithHeight();

    }
}
