package datatypes.exercuse008;

import java.util.Scanner;

/***
 * Write a Java program that reads a number and display the square, cube, and fourth power.
 */
public class Exercise008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = sc.nextInt();

        double squareExponent = 2.0;
        double cubeExponent = 3.0;
        double fourthPowerExponent = 4.0;
        double square = Math.pow(number, squareExponent);
        double cube = Math.pow(number, cubeExponent);
        double fourthPower = Math.pow(number, fourthPowerExponent);

        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Fourth power: " + fourthPower);

    }
}
