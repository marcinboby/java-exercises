package datatypes.exercuse005;

import java.util.Scanner;

/***
 *  Write a Java program that prints the current time in GMT.
 */
public class Exercise005 {
    public static void main(String[] args) {
        System.out.print("Input zone offset: ");
        Scanner scanner = new Scanner(System.in);
        int zone = scanner.nextInt();
        System.out.println(zone%10);
        getCurrentTime(zone);
    }

    private static void getCurrentTime(int zone) {
        long currentTimeMillis = System.currentTimeMillis();
        int millisInSecond = 1000;
        long totalSeconds = currentTimeMillis / millisInSecond;
        int secondsInMinute = 60;
        long currentSecond = totalSeconds % secondsInMinute;
        long totalMinutes = totalSeconds / secondsInMinute;
        int minutesInHour = 60;
        long currentMinute = totalMinutes % minutesInHour;
        long totalHours = totalMinutes / minutesInHour;
        int hoursInADay = 24;
        long currentHour = (totalHours + zone) % hoursInADay;
        System.out.println("Current time is :  " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
