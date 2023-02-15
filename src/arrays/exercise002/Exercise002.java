package arrays.exercise002;

import java.util.Arrays;

/***
 * Write a Java program to sum values of an array.
 */
public class Exercise002 {
    public static void main(String[] args) {
        int[] integerArr = {1, 3, 5, 7};
        int sum = Arrays.stream(integerArr).sum();
        System.out.println(sum);
    }
}
