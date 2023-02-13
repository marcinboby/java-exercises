package datatypes.exercuse009;

import java.util.Scanner;

/***
 * Write a Java program that accepts two integers from the user and then prints the sum, the difference,
 * the product, the average, the distance (the difference between integer),
 * the maximum (the larger of the two integers), the minimum (smaller of the two integers).
 */
public class Exercise009 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = sc.nextInt();

        int min = Math.min(firstNumber, secondNumber);
        int max = Math.max(firstNumber, secondNumber);
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double avg = sum / 2.0;
        int distance = Math.abs((max - min));
        System.out.println("Sum of those numbers is: " + sum);
        System.out.println("Difference of those numbers is: " + difference);
        System.out.println("Larger value of those numbers is: " + max);
        System.out.println("Lower value of those numbers is: " + min);
        System.out.println("Average of those numbers is: " + avg);
        System.out.println("Product of those numbers is: " + product);
        System.out.println("Difference between those numbers is: " + difference);

    }
}
