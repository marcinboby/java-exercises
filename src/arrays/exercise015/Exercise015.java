package arrays.exercise015;

import java.util.Arrays;

/***
 * Write a Java program to remove duplicate elements from an array.
 */
public class Exercise015 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 1, 2, 3, 12, 1, 12, 14, 13};
        int arrLength = arr.length;

        for (int i = 0; i < arrLength; i++) {
            for (int j = i + 1; j < arrLength; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[arrLength - 1];
                    arrLength--;
                    j--;
                }
            }
        }
        int[] newArr = Arrays.copyOf(arr, arrLength);
        System.out.println(Arrays.toString(newArr));
    }
}