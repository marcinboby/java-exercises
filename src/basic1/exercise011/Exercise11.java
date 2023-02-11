package basic1.exercise011;

import java.util.Scanner;

/**
 * Program to convert a decimal number to binary number.
 */
public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input decimal number: ");
        int decimalNumber = scanner.nextInt();
        String binaryNumber = Integer.toString(decimalNumber, 2);
        System.out.println("Decimal number " + decimalNumber + " in binary is " + binaryNumber);

    }
}

