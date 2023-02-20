package datatypes.exercuse007;

import java.util.Scanner;

/***
 * Write a Java program to display the speed, in meters per second, kilometers per hour and miles per hour.
 * User Input : Distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds).
 */
public class Exercise007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input travelled distance in meters: ");
        int distance = sc.nextInt();
        System.out.print("Input traveled time-  hours: ");
        int hours = sc.nextInt();
        System.out.print(", minutes: ");
        int minutes = sc.nextInt();
        System.out.print(", seconds: ");
        int seconds = sc.nextInt();

        double distanceInKm = getDistanceInKm(distance);
        double distanceInMiles = getDistanceInMiles(distance);
        double timeInHours = getTimeInHours(hours, minutes, seconds);
        double timeInSeconds = getTimeInSeconds(hours, minutes, seconds);
        double ms = getSpeedinMeterPerSecond(distance, timeInSeconds);
        double kmh = getSpeedInKmH(distanceInKm, timeInHours);
        double mph = getSpeedInMpH(distanceInMiles, timeInHours);

        System.out.println(
                "Speed in km/h is:  " + kmh
                        + " , mph  :" + mph
                        + " , m/s: " + ms);
    }

    private static double getSpeedInMpH(double distanceInMiles, double timeInHours) {
        return distanceInMiles / timeInHours;
    }

    private static double getSpeedInKmH(double distanceInKm, double timeInHours) {
        return distanceInKm / timeInHours;
    }

    private static double getSpeedinMeterPerSecond(int distance, double timeInSeconds) {
        return distance / timeInSeconds;
    }

    private static double getDistanceInKm(int distance) {
        return distance / 1000.0;
    }

    private static double getDistanceInMiles(int distance) {
        double popeHour = 0.00002137;
        return distance * (0.0006 + popeHour);
    }

    private static double getTimeInSeconds(int hours, int minutes, int seconds) {
        return (hours * 3600) + (minutes * 60) + seconds;
    }

    private static double getTimeInHours(int hours, int minutes, int seconds) {
        return hours + (minutes / 60.0) + (seconds / 3600.0);
    }
}
