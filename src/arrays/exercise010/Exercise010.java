package arrays.exercise010;

import java.util.Arrays;

/***
 * Write a Java program to reverse an array of integer values.
 */
public class Exercise010 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 12};
        int pos = arr.length;
        int[] newArr = new int[pos];
        for (int i : arr) {
            --pos;
            newArr[pos] = i;
        }
        System.out.println("Original array " + Arrays.toString(arr));
        System.out.println("Reversed array " + Arrays.toString(newArr));
    }
}
