package arrays.exercise019;

import java.util.ArrayList;
import java.util.List;

/***
 * Write a Java program to convert an array to ArrayList.
 */
public class Exercise019 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 12};
        List<Integer> arrayList = new ArrayList<>();
        for (int i : arr) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
    }
}
