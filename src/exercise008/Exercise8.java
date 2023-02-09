package exercise008;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables
 */
public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstVar = scanner.nextInt();
        System.out.print("Input second number: ");
        int secondVar = scanner.nextInt();
        System.out.println("Before swap: firstVar: " + firstVar + ", secondVar: " + secondVar);
        firstVar = firstVar + secondVar;
        secondVar = firstVar - secondVar;
        firstVar = firstVar - secondVar;
        System.out.println("After swap: firstVar: " + firstVar + ", secondVar: " + secondVar);
    }
}