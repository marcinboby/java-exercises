package arrays.exercise003;

import java.util.Arrays;

/***
 * Write a Java program to calculate the average value of array elements.
 */
public class Exercise003 {
    public static void main(String[] args) {
        int[] intArr = {1, 3, 5, 5, 5, 5, 5, 5};
        double avg = Arrays.stream(intArr).average().getAsDouble();
        System.out.println(avg);
    }
}
