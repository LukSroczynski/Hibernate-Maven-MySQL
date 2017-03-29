package jdbc.connection.checker;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Łukasz S. on 28.03.2017.
 */
public class ConnectorJDBC {
    public static void main(String[] args) {


        String URL = "jdbc:postgresql://127.0.0.1:5432/HibernateTest";
        String USER = "postgres";
        String PASSWORD = "zaq12wsx";

        try {

            System.out.println("Conn to DB" + URL);

            Connection connection = DriverManager.getConnection(
                    URL, USER, PASSWORD);

            System.out.println("Conn successful");

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
