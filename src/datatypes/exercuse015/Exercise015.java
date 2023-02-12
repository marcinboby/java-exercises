package datatypes.exercuse015;

import java.util.Scanner;

/***
 * Write a Java program to get the next floating-point adjacent
 * in the direction of positive and negative infinity from a given float/double number.
 */
public class Exercise015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input double number: ");
        double doubleNum = sc.nextDouble();
        double doubleNumUp = Math.nextUp(doubleNum);
        double doubleNumDown = Math.nextDown(doubleNum);
        System.out.println("Next adjacent number up to " + doubleNum + " is " + doubleNumUp);
        System.out.println("Nexr adjacent number down to " + doubleNum + " is " + doubleNumDown);

        System.out.println("\nSame with float type number.. \n");
        System.out.print("Input float number: ");
        float floatNum = sc.nextFloat();
        float floatNumUp = Math.nextUp(floatNum);
        float floatNumDown = Math.nextDown(floatNum);
        System.out.println("Next adjacent number up to " + floatNum + " is " + floatNumUp);
        System.out.println("Nexr adjacent number down to " + floatNum + " is " + floatNumDown);
    }
}
