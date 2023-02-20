package arrays.exercise004;

import java.util.Arrays;

/***
 * Write a Java program to test if an array contains a specific value.
 */
public class Exercise004 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 45};
        int valToCheck = 4;
        boolean present = Arrays.stream(intArr).filter(value -> value == valToCheck).findAny().isPresent();

        if (present) {
            System.out.println("This arr contains value: " + valToCheck);
        } else {
            System.out.println("The intArr do not contain value: " + valToCheck);
        }
    }


}
