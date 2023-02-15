package datatypes.exercuse014;

import java.math.BigInteger;
import java.util.Scanner;

/***
 * Write a Java program to extract the primitive type value from a given BigInteger value.
 */
public class Exercise014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number value: ");
        BigInteger bigIntVal = sc.nextBigInteger();

        int intValue = bigIntVal.intValue();

        System.out.println(intValue);
    }
}
