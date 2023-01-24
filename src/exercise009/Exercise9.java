package exercise009;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers
 */
public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        int firstNumber = scanner.nextInt(2);
        System.out.print("Input second binary number: ");
        int secondNumber = scanner.nextInt(2);
        int sum;
        sum = firstNumber + secondNumber;
        String binarySum = Integer.toString(sum, 2);
        System.out.println("Binary sum is: " + binarySum);
    }
}
