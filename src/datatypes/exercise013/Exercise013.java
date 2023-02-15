package datatypes.exercuse013;

import java.util.Scanner;

/***
 *Write a Java program to compute the floor division and the floor modulus of the given dividend and divisor.
 */
public class Exercise013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Input divisor: ");
        int divisor = sc.nextInt();
        int floorDivResult = Math.floorDiv(dividend, divisor);
        int floorModResult = Math.floorMod(dividend, divisor);
        System.out.println("Floor division result: " + floorDivResult);
        System.out.println("Floor modulus result: " + floorModResult);
    }
}
