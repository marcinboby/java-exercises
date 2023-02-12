package simpleexercises1.exercise006;

import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
 */
public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        Double firstNumber = scanner.nextDouble();
        System.out.print("Input second number: ");
        Double secNumber = scanner.nextDouble();
        double sum = firstNumber + secNumber;
        System.out.println("Sum of those numbers is: " + sum);
        double diff = firstNumber - secNumber;
        System.out.println("Difference between those numbers is :" + diff);
        double product = firstNumber * secNumber;
        System.out.println("Product of those numbers is: " + product);
        double quotient = firstNumber / secNumber;
        System.out.println("Quotient of those numbers is: " + quotient);
        double reminder = firstNumber % secNumber;
        System.out.println("Reminder of those numbers is: " + reminder);
    }
}
