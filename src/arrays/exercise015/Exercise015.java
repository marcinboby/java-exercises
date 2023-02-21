package arrays.exercise015;

import java.util.HashSet;
import java.util.Set;

/***
 * Write a Java program to remove duplicate elements from an array.
 */
public class Exercise015 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 1, 2, 3, 12, 1, 12, 14, 13};
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        System.out.println(set);
    }
}
