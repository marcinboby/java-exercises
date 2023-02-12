package datatypes.exercise003;

import java.util.Scanner;

/***
 * Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
 */
public class Exercise003 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Input number between 0 and 1000: ");
            number = scanner.nextInt();
            if ((0 <= number) && (1000 >= number)) {
                int sum = digitSum(number);
                System.out.println("Sum of digits from number: " + number + " is : " + sum);
                break;
            } else {
                System.out.println("Number is out of range, try again");
            }
        }
    }

    private static int digitSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
