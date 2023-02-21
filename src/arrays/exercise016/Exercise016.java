package arrays.exercise016;

import java.util.SortedSet;
import java.util.TreeSet;

/***
 * Write a Java program to find the second largest element in an array.
 */
public class Exercise016 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 12, 16, 2, 123, 12, 423};
        SortedSet<Integer> intSet = new TreeSet<>();

        for (int i : arr) {
            intSet.add(i);
        }
        Integer[] array = new Integer[intSet.size()];
        array = intSet.toArray(array);
        System.out.println(array[array.length - 2]);
    }
}
