package arrays.exercise014;

import java.util.ArrayList;
import java.util.List;

/***
 * Write a Java program to find the duplicate values of an array of string values.
 */
public class Exercise014 {
    public static void main(String[] args) {
        String[] arr = {"1", "dwa", "foo", "bar", "dddd", "bar", "foo"};
        List<String> duplicatedStrings = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j]) && i != j) {
                    duplicatedStrings.add(arr[j]);
                }
            }
        }

        System.out.println(duplicatedStrings);
    }

}
