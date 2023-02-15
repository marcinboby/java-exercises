package datatypes.exercuse012;

import java.util.Scanner;

/***
 * Write a Java program to test whether a given double/float value is a finite floating-point value or not.
 */
public class Exercise012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input double number to check if is finite: ");
        double doubleNum = sc.nextDouble();
        boolean doubleNumCheck = Double.isFinite(doubleNum);
        if (doubleNumCheck) {
            System.out.println("Double number " + doubleNum + " is finite");
        } else {
            System.out.println("Double number " + doubleNum + " is not finite");
        }
        boolean doubleNumCheck2 = Double.isFinite((doubleNum / 0));
        double doubleNum2 = Double.POSITIVE_INFINITY * 0;
        boolean doubleNumCheck3 = Double.isFinite(doubleNum2);
        System.out.println(doubleNum + "/0 is finite? " + doubleNumCheck2);
        System.out.println(doubleNum2 + " is finite? " + doubleNumCheck3);


        System.out.print("Input float number: ");
        float floatNum = sc.nextFloat();
        boolean floatNumCheck = Float.isFinite(floatNum);
        if (floatNumCheck) {
            System.out.println("Float number " + floatNum + " is finite");
        } else {
            System.out.println("Float number " + floatNum + " is not finite");
        }
        boolean floatNumCheck2 = Float.isFinite((floatNum / 0));
        float floatNum2 = Float.POSITIVE_INFINITY * 0;
        boolean floatNumCheck3 = Float.isFinite(floatNum2);
        System.out.println(floatNum + "/0 is finite? " + floatNumCheck2);
        System.out.println(floatNum2 + " is finite? " + floatNumCheck3);
    }
}
