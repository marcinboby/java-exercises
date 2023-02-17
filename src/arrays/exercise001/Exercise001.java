package arrays.exercise001;

import java.util.Arrays;

/***
 * Write a Java program to sort a numeric array and a string array.
 */
public class Exercise001 {
    public static void main(String[] args) {
        int[] integerArray = {12, 1, -7, 153, 12345, 13, 175};
        int [] sortedArray = Arrays.copyOf(integerArray, integerArray.length);
        Arrays.sort(sortedArray);

        System.out.println(Arrays.toString(integerArray));
        System.out.println("After sorting: " + Arrays.toString(sortedArray));


        String[] stringArray = {"Ala", "Vid", "012", "___", "arr", "zzzz", "ZZZZ"};
        String[] stringArraySorted = Arrays.copyOf(stringArray, stringArray.length);
        Arrays.sort(stringArraySorted);

        System.out.println(Arrays.toString(stringArray));
        System.out.println("After sorting: " + Arrays.toString(stringArraySorted));


    }
}
