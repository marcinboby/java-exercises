package arrays.exercise027;

/***
 * Write a Java program to find the number of even and odd integers in a given array of integers.
 */
public class Exercise027 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        int sumOfEven = 0;
        int sumOfOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0){
                sumOfEven++;
            }
            else {
                sumOfOdd++;
            }
        }
        System.out.println("Sum of even: " + sumOfEven);
        System.out.println("Sum of odd: " + sumOfOdd);
    }
}
