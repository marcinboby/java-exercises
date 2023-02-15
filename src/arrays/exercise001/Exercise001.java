package arrays.exercise001;

import java.util.Arrays;

/***
 * Write a Java program to sort a numeric array and a string array.
 */
public class Exercise001 {
    public static void main(String[] args) {
        int[] integerArray = {12, 1, -7, 153, 12345, 13, 175};
        int[] sortedArray = new int[integerArray.length];
        System.arraycopy(integerArray, 0, sortedArray, 0, integerArray.length);
        Arrays.sort(sortedArray);

        for (int i : integerArray) {
            String val = String.valueOf(i);
            System.out.print(val + " ");
        }
        System.out.print("\nAfter sorting: ");
        for (int i : sortedArray) {
            String val = String.valueOf(i);
            System.out.print(val + "  ");
        }


        String[] stringArray = {"Ala", "Vid", "012", "___", "arr", "zzzz", "ZZZZ"};
        String[] stringArraySorted = new String[stringArray.length];
        System.arraycopy(stringArray, 0, stringArraySorted, 0, stringArray.length);
        Arrays.sort(stringArraySorted);

        System.out.println("\n");
        for (String s : stringArray) {
            System.out.print(s + " ");
        }
        System.out.println("\nAfter sorting: ");
        for (String s : stringArraySorted) {
            System.out.print(s + " ");
        }


    }
}
