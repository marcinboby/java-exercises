package arrays.exercise030;

/***
 * Write a Java program to check if an array of integers is without 0 and -1.
 */
public class Exercise030 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 1, 0, -3};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0 || arr[i] == -1){
                System.out.println("arr is with 0 or -1");
                System.exit(0);
            }
        }
        System.out.println("arr is without 0 or -1");
    }
}
