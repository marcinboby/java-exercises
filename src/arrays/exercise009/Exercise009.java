package arrays.exercise009;

import java.util.Arrays;

/***
 * Write a Java program to find the maximum and minimum value of an array.
 */
public class Exercise009 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 12, 3};
        int maxInt = Arrays.stream(arr).max().getAsInt();
        int minInt = Arrays.stream(arr).min().getAsInt();
        System.out.println("Min: " + minInt + " max: " + maxInt);
    }
}
