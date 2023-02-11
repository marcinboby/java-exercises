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
                int alternativeDigitSum = alternativeDigitSum(number);
                System.out.println("Sum of digits from number: " + number + " is : " + sum);
                System.out.println("Sum of digits from number: " + number + " is : " + alternativeDigitSum);
                break;
            } else {
                System.out.println("Number is not in the range, try again");
            }
        }
    }

    private static int digitSum(int number) {
        int first = number % 10;
        int reminder = number / 10;
        int second = reminder % 10;
        reminder = reminder / 10;
        int thrid = reminder % 10;
        reminder = reminder / 10;
        int fourth = reminder % 10;
        return first + second + thrid + fourth;

    }

    private static int alternativeDigitSum(int number) {
        int expectedSum = 0;
        while (number != 0) {
            expectedSum += number % 10;
            number /= 10;
        }
        return expectedSum;
    }
}
