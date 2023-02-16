package arrays.exercise006;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;

/***
 * Write a Java program to remove a specific element from an array.
 */
public class Exercise006 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 10, 12};
        int elementToRemove = 4;
        System.out.println(Arrays.toString(arr));

        OptionalInt anInt = Arrays.stream(arr)
                .filter(el -> el == elementToRemove)
                .findAny();

        boolean isPresent = anInt
                .isPresent();

        if(isPresent){
            ArrayList<Integer> newArr = new ArrayList<>();
            for (int i : arr) {
                if (i != elementToRemove) {
                    newArr.add(i);
                }
            }
            System.out.println("-----");
            newArr.forEach(System.out::println);
        }

    }
}
