package arrays.exercise005;

import java.util.Arrays;

/***
 * Write a Java program to find the index of an array element.
 */
public class Exercise005 {
    public static void main(String[] args) {
        int[] intArr = {1, 3, 5, 6, 8, 12};

        int testVal = 1;
        int indexValue = findIndexValue(intArr, testVal);
        System.out.println(indexValue);
    }

    public static int findIndexValue(int[] arr, int val) {
        boolean present = Arrays.stream(arr)
                .filter(value -> value == val).findFirst().isPresent();

        if (present) {
            int i = 0;
            int length = arr.length;

            while (i < length) {
                if (arr[i] == val) {
                    return i;
                } else {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }
}
