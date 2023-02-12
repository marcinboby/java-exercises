package datatypes.exercuse011;

/***
 *Write a Java program to compare two given signed and unsigned numbers.
 */
public class Exercise011 {
    public static void main(String[] args) {
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;

        System.out.println("Integer minimum value is: " + minInt + " and maximum value: " + maxInt);

        int unsignedCompareInt = Integer.compareUnsigned(minInt, maxInt);
        int signedCompareInt = Integer.compare(minInt, maxInt);
        System.out.println("Result of comparing unsigned integers is: " + unsignedCompareInt);
        System.out.println("Result of comparing signed integers is: " + signedCompareInt);
    }
}
