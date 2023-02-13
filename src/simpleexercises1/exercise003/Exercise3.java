package simpleexercises1.exercise003;

/**
 * Write a Java program to divide two numbers and print on the screen.
 * Test Data :
 * 50/3
 * Expected Output :
 * 16
 */
public class Exercise3 {
    public static void main(String[] args) {
        int number1 =50, number2 = 3;
        double result= number1/(double)number2;
        System.out.println("Result of dividing two numbers(" + number1+ ", " + number2 + ") is: " + result);
    }
}
