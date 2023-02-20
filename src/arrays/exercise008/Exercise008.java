package arrays.exercise008;

import java.util.Arrays;

/***
 * Write a Java program to insert an element (specific position) into an array.
 */
public class Exercise008 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7};
        int indexPos = 5;
        int val = 123;
        int[] newArr = new int[arr.length + 1];
        int positionInArr = indexPos - 1;
        System.arraycopy(arr, 0, newArr, 0, positionInArr);
        newArr[positionInArr] = val;
        System.arraycopy(arr, positionInArr, newArr, indexPos, arr.length - positionInArr);
        System.out.println(Arrays.toString(newArr));
    }

}
