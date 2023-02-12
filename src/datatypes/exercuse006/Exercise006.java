package datatypes.exercuse006;

import java.util.Scanner;

/***
 * Write a Java program to compute body mass index (BMI)
 */

public class Exercise006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Input your height in cm: ");
        double heightInCm = sc.nextDouble();
        final int cmInMeter = 100;
        double heightInM = heightInCm / cmInMeter;
        int exponent = 2;
        double bmi = weight / Math.pow(heightInM, exponent);
        System.out.println("BMI for " + weight + " kg, " + heightInCm + " cm is : " + bmi);
    }
}
