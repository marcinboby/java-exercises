package arrays.exercise013;

import java.util.ArrayList;
import java.util.List;

/***
 * Write a Java program to find the duplicate values of an array of integer values.
 */
public class Exercise013 {
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 1, 6, 21, 1, 432, 234, 12, 1};
        List<Integer> duplicatedIntegers = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    duplicatedIntegers.add(arr[i]);
                }

            }
        }
        System.out.println(duplicatedIntegers);
    }
}
