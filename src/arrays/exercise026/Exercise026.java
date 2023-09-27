package arrays.exercise026;

/***
 * Write a Java program to move all 0's to the end of an array.
 * Maintain the relative order of the other (non-zero) array elements.
 */
public class Exercise026 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 0, 10, 23, 0, 32};
        System.out.println("Original array: ");
        for (int i : arr) {
            System.out.print(i + "  ");
        }

        int j = 0;
        int l = arr.length;
        for (int k = 0; k < l; ) {
            if (arr[k] == 0) {
                k++;
            } else {
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                j++;
                k++;
            }
        }
        System.out.println("After moving 0 to the of array: ");
        for (int z : arr) {
            System.out.print(z + " ");
        }

    }
}
