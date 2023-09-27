package arrays.exercise025;

import java.util.ArrayList;
import java.util.Arrays;

/***
 *  Write a Java program to move all 0's to the end of an array.
 *  Maintain the relative order of the other (non-zero) array elements.
 */
public class Exercise025 {

    public static void main(String[] args) {

        int[] arr = {1, 4, 0, 12, 0, 15, 16, 0, 11, 0, 0, 122, 125};
        ArrayList<Integer> zeroAtIndex = new ArrayList<>();
        int[] arr2 = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroAtIndex.add(i);
            }
        }
        int size = zeroAtIndex.size();
        System.out.println(zeroAtIndex);
        for (int j = 0; j < arr.length; j++) {

            for (Integer atIndex : zeroAtIndex) {
                if (atIndex == j) {
                    for (int i = j; i < arr.length; i++) {
                        arr2[i] = arr[j+1];
                    }


                }
//                System.out.println(Arrays.toString(arr2));
            }
        }
        System.out.println(Arrays.toString(arr2));


    }
}
