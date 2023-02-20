package arrays.exercise006;

import java.util.ArrayList;
import java.util.Arrays;

/***
 * Write a Java program to remove a specific element from an array.
 */
public class Exercise006 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 10, 12};
        int elementToRemove = 4;
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i : arr) {
            if (i != elementToRemove) {
                newArr.add(i);
            }
        }
        System.out.println("-----");
        System.out.println(newArr);
    }

}
