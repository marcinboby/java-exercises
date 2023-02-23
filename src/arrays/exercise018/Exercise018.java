package arrays.exercise018;

import java.util.Arrays;

/***
 * Write a Java program to add two matrices of the same size.
 */
public class Exercise018 {
    public static void main(String[] args) {
        int[][] firstMatrix = {{1, 2}, {1, 2}};
        int[][] secondMatrix = {{7, 0}, {4, 1}};
        int[][] sumOfMatrixVal = new int[2][2];
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix.length; j++) {
                sumOfMatrixVal[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        System.out.println(Arrays.deepToString(sumOfMatrixVal));
    }

}
