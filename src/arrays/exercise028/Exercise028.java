package arrays.exercise028;

/***
 * Write a Java program to get the difference between
 * the largest and smallest values in an array of integers.
 * The array must have a length of at least 1.
 */
public class Exercise028 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 12, 15, 23, 0, -4};
        int largestInt = 0;
        int smallestInt = 0;

        for (int i : arr) {
            if (i > largestInt) {
                largestInt = i;
            }
            else if (i < smallestInt) {
                smallestInt = i;
            }
        }
        System.out.println("Smallest int in array is: " + smallestInt);
        System.out.println("Largest int in array is: " + largestInt);
    }

}

