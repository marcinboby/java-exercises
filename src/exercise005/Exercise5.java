package exercise005;

import java.util.Scanner;

/**
 * Write a Java program that takes two numbers as input and display the product of two numbers.
 */
public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Great! Input second number: ");
        double secNumber = scanner.nextDouble();
        System.out.println("Product of those numbers is: " + (firstNumber * secNumber));
    }
}
