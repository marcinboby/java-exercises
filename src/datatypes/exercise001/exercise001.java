package datatypes.exercise001;

import java.util.Scanner;

/***
 * Write a Java program to convert temperature from Fahrenheit to Celsius degree.
 */
public class exercise001 {
    public static void main(String[] args) {
        Double fahrenheitTemperature, celsiusTemperature;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input temperature in Fahrenheit: ");
        fahrenheitTemperature = scanner.nextDouble();
        celsiusTemperature = getCelsiusTemperature(fahrenheitTemperature);
        System.out.println(fahrenheitTemperature + " Fahrenheit degree is " + celsiusTemperature + " Celsius degree");
    }
    private static Double getCelsiusTemperature(Double fahrenheitTemperature) {
        return fahrenheitTemperature - (32 * (5 / (double) 9));
    }
}
