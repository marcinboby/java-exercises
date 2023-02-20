package arrays.exercise017;

import java.util.Arrays;

/***
 *  Write a Java program to find the second smallest element in an array.
 */
public class Exercise017 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 12, 16, 2, 123, 12, 423};
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}
