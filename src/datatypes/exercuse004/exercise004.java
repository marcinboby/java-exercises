package datatypes.exercuse004;

import java.util.Scanner;

/***
 * Write a Java program to convert minutes into a number of years and days.
 */
public class exercise004 {
    public static void main(String[] args) {
        long inputMinutes;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        inputMinutes = scanner.nextLong();
        convertMinutesIntoYearsAndDays(inputMinutes);
    }

    private static void convertMinutesIntoYearsAndDays(long inputMinutes) {
        int minutesIn365days = 525600;
        int minutesInDay = 1440;
        int minutesInHour = 60;
        if (inputMinutes < minutesInDay) {
            System.out.println(inputMinutes + " minutes is " + (inputMinutes / (double) minutesInHour) + " hour/s");
        } else if (inputMinutes > minutesInDay && inputMinutes < minutesIn365days) {
            long minutesToDay = inputMinutes / minutesInDay;

            System.out.println(inputMinutes + " minutes is " + minutesToDay + " day/s");

        } else if (inputMinutes > minutesIn365days) {
            long minutesToYears = inputMinutes / minutesIn365days;
            long minutesToDays = (inputMinutes % minutesIn365days) / minutesInDay;

            System.out.println(inputMinutes + " minutes is " + minutesToYears + " year/s and " + minutesToDays + " days ");
        }
    }
}
