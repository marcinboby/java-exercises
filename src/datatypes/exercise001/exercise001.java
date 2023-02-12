package datatypes.exercise001;

import java.util.Scanner;

/***
 * Write a Java program to convert temperature from Fahrenheit to Celsius degree.
 */
public class exercise001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input temperature in Fahrenheit: ");
        Double fahrenheitTemperature = scanner.nextDouble();
        Double celsiusTemperature = getCelsiusTemperature(fahrenheitTemperature);
        System.out.println(fahrenheitTemperature + " Fahrenheit degree is " + celsiusTemperature + " Celsius degree");
    }

    private static Double getCelsiusTemperature(Double fahrenheitTemperature) {
        return fahrenheitTemperature - (32 * (5.0 / 9.0));
    }
}
