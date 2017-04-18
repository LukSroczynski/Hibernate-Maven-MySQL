package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

/**
 * Created by Surreallistic on 05.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestDatabase");
        EntityManager entityManager = entityManagerFactory.createEntityManager();



        entityManager.close();
        entityManagerFactory.close();

    }
}
