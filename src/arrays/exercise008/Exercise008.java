package arrays.exercise008;

/***
 * Write a Java program to insert an element (specific position) into an array.
 */
public class Exercise008 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7};
        int indexPos = 2;
        int val = 2;
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, 1);
        int positionInArr = indexPos - 1;
        newArr[positionInArr] = val;
        System.arraycopy(arr, 1, newArr, 2, arr.length - 1);

    }
}
