package arrays.exercise016;

import java.util.Arrays;

/***
 * Write a Java program to find the second largest element in an array.
 */
public class Exercise016 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 12, 16, 2, 123, 12, 423};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
