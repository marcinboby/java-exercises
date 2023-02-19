package arrays.exercise011;

/***
 *  Write a Java program to find the common elements between two arrays of integers.
 */
public class Exercise011 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 12, 125, 1234, 111, 2};
        int[] arr2 = {1, 3, 7, 6, 123456, 54321, 5};

        for (int i : arr) {
            for (int j : arr2) {
                if (i == j) {
                    System.out.println(i);
                }
            }
        }
    }
}
