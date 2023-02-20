package arrays.exercise007;

/***
 * Write a Java program to copy an array by iterating the array.
 */
public class Exercise007 {
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 6};
        int length = arr.length;
        int[] newArr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
    }
}
