package arrays.exercise020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 * Write a Java program to convert an ArrayList to an array.
 */
public class Exercise020 {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        int i = 5;
        int j = 0;
        do {
            arrList.add(j);
            j++;
        } while (j < i);
        int arrListSize = arrList.size();
        int[] arr = new int[arrListSize];
        for (int k = 0; k < arrList.size(); k++) {
            arr[k] = arrList.get(k);
        }
        System.out.println(arrList);
        System.out.println("---");
        System.out.println(Arrays.toString(arr));
    }
}
