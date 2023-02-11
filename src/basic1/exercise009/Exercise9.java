package basic1.exercise009;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers
 */
public class Exercise9 {
    public static void main(String[] args) {
        int i = 0, remainder = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        long firstNumber = scanner.nextLong();
        System.out.print("Input second binary number: ");
        long secondNumber = scanner.nextLong();
        int[] sum = new int[20];

        while (firstNumber != 0 || secondNumber != 0) {
            sum[i++] = (int) ((firstNumber % 10 + secondNumber % 10 + remainder) % 2);
            remainder = (int) ((firstNumber % 10 + secondNumber % 10 + remainder) / 2);
            firstNumber = firstNumber / 10;
            secondNumber = secondNumber / 10;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }
        --i;
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.println("\n");

    }
}

