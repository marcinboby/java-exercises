package arrays.exercise029;

import java.util.Arrays;

/***
 * Write a Java program to compute the average value
 * of an array of integers except the largest and smallest values.
 */
public class Exercise029 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 5, 5, 5, 23, 5, 5};
        Arrays.sort(arr);
        int arrLength = arr.length;
        int[] arrCopy = Arrays.copyOfRange(arr, 1, arrLength - 1);
        int arrCopyLength = arrCopy.length;
        int sumOfInt = 0;
        for (int i : arrCopy) {
            sumOfInt += i;
        }
        int avg = sumOfInt / arrCopyLength;
        System.out.println("avg = " + avg);
    }
}
