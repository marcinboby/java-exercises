package datatypes.exercise002;

import java.util.Scanner;

/***
 * Write a Java program that reads a number in inches, converts it to meters.
 */
public class Exercise002 {
    public static void main(String[] args) {
        Double inch, meter;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number in inches: ");
        inch = scanner.nextDouble();
        meter = getMeter(inch);
        System.out.println(inch + " inch/es is/are: " + meter + " meter/s");
    }
    private static Double getMeter(Double inch) {
        final double v = 2.54;
        return inch * v;
    }
}
