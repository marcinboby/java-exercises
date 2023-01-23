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

        for(int i =1; i<=10; i++){
            double result = num * i;
            System.out.println("Sum of multiplication " + num + " by " + i + " is : " + result);
        }
    }
}