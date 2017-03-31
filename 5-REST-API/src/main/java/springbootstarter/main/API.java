package springbootstarter.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Łukasz S. on 29.03.2017.
 */

@SpringBootApplication
@ComponentScan("springbootstarter")
public class API {
    public static void main(String[] args) {

        /**
         * To change port of tomcat:
         * System.getProperties().put("server.port", "8080");
         * Tomcat-Springboot default port is: 8080
         *
         * Spirng-boot:
         * - sets up default configuration
         * - starts spring application context
         * - performs class path scan
         * - starts tomcat server
         *
         */

        SpringApplication.run(API.class, args);

    }
}
