package datatypes.exercuse010;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/***
 * Write a Java program to break an integer into a sequence of individual digits.
 */
public class Exercise010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number to break into a sequence of individual digits: ");
        int numberToBreak = sc.nextInt();
        ArrayList<Integer> arrayOfIntegers = new ArrayList<>();
        while (numberToBreak != 0) {
            int number = numberToBreak % 10;
            numberToBreak /= 10;
            arrayOfIntegers.add(number);
        }
        Collections.reverse(arrayOfIntegers);
        for (Integer number : arrayOfIntegers) {
            System.out.print(number + " ");
        }
    }
}
