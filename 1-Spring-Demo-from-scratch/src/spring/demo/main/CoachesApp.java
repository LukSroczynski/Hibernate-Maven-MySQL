package spring.demo.main;

import spring.demo.coaches.BaseballCoach;
import spring.demo.coaches.Coach;
import spring.demo.coaches.TrackCoach;

/**
 * Created by user on 23.03.2017.
 */
public class CoachesApp {
    public static void main(String[] args) {

        // Create Object
        Coach baseballCoach = new BaseballCoach();
        Coach trackCoach = new TrackCoach();

        /**
         *  Right now Coach implementation is Hard Coded
         *  It would be ideal to read a file and load configuration from it.
         *  Spring was design exacly for that problem.
         */

        // Use Object
        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyWorkout());
        System.out.println(Coach.class);

    }
}
