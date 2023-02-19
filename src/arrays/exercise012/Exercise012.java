package arrays.exercise012;

/***
 * Write a Java program to find the common elements between two arrays (string values).
 */
public class Exercise012 {

    public static void main(String[] args) {
        String[] arr = {"1", "dwa", "foo", "bar", "dddd"};
        String[] arr2 = {"1", "jeden", "foo", "bool", "ddd"};

        for (String i : arr) {
            for (String j : arr2) {
                if (i.equals(j)) {
                    System.out.println(i);
                }
            }
        }
    }
}
