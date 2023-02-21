package arrays.exercise013;

import java.util.HashSet;
import java.util.Set;

/***
 * Write a Java program to find the duplicate values of an array of integer values.
 */
public class Exercise013 {
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 1, 6, 21, 1, 432, 234, 12, 1};
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicatedValues = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i)) {
                duplicatedValues.add(i);
            } else {
                set.add(i);
            }
        }
        System.out.println("Duplicated values: " + duplicatedValues);
    }
}