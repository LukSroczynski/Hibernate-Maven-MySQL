package main;

import domain.Emplyee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

/**
 * Created by Surreallistic on 05.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestDatabase");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Emplyee emplyee = new Emplyee();
//        emplyee.setId(1L);
        emplyee.setFirstName("Jack");
        emplyee.setLastName("Morgan");
        emplyee.setSalary(3500.50);
        emplyee.setSalary2(new BigDecimal(3400.303221));

        Emplyee emplyee2 = new Emplyee();
//        emplyee.setId(1L);
        emplyee2.setFirstName("Hello");
        emplyee2.setLastName("World");
        emplyee2.setSalary(5600.20);

        // wszelkie operacje wstawiające do bazy muszą być wykonywane w ramach transakcji
        entityManager.getTransaction().begin();
        entityManager.persist(emplyee);
        entityManager.persist(emplyee2);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }
}
