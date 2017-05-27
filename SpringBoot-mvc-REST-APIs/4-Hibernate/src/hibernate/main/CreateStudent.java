package hibernate.main;

import hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Łukasz S. on 28.03.2017.
 */
public class CreateStudent {
    public static void main(String[] args) {

        // 1. Create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // 2. Create session
        Session session = factory.getCurrentSession();

        try {
            // Use the session object to save Java Objects

            // 1. Create a student object
            System.out.println("Create a student object");
            Student student = new Student("Paul", "Wall", "paulWall@gmail.com");

            // 2. Start a transaction
            System.out.println("Start a transaction");
            session.beginTransaction();

            // 3. Save student object
            System.out.println("Save student object");
            session.save(student);

            // 4. Commit transaction
            System.out.println("Commit transaction");
            session.getTransaction().commit();

            System.out.println("Done");

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            factory.close();
        }
    }
}
