package main;

import domain.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Surreallistic on 05.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestDatabase");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Employee employee = new Employee();
        employee.setFirstName("Jan");
        employee.setLastName("Nowak");
        employee.setSalary(23243.33);
        employee.setLocality("Warszawa");
        employee.setZipCode("12-221");
        employee.setStreet("Gdanska");
        employee.setStreetNumber(11);

        entityManager.getTransaction().begin(); // start transactionm

        entityManager.persist(employee); // save guy to DB

        entityManager.getTransaction().commit(); // end transaction

        entityManager.close();
        entityManagerFactory.close();

    }
}
