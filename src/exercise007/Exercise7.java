package exercise007;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its multiplication table upto 10.
 */
public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        double num = scanner.nextDouble();

        for (int i = 0; i < 10; i++) {
            int multiplier = i + 1;
            double result = num * multiplier;
            System.out.println("Sum of multiplication " + num + " by " + multiplier + " is : " + result);

        }
    }
}
