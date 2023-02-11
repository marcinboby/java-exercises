package basic1.exercise004;

/**
 * Write a Java program to print the result of the following operations.
 * Test Data:
 * a. -5 + 8 * 6
 * b. (55+9) % 9
 * c. 20 + -3*5 / 8
 * d. 5 + 15 / 3 * 2 - 8 % 3
 * Expected Output :
 * 43
 * 1
 * 19
 * 13
 */
public class Exercise4 {
    public static void main(String[] args) {
        int aNumber1 = -5;
        int aNumber2 = 8;
        int aNumber3 = 6;
        int aResult = aNumber1 + aNumber2 * aNumber3;
        int bNumber1 = 55;
        int bNumber2 = 9;
        int bResult = (bNumber1 + bNumber2) % bNumber2;
        int cNumber1 = 20;
        int cNumber2 = -3;
        int cNumber3 = 5;
        int cNumber4 = 8;
        double cResult = cNumber1 + cNumber2 * (cNumber3 / (double) cNumber4);
        double cResultRoundUp = Math.ceil(cResult);
        int dNumber1 = 5;
        int dNumber2 = 15;
        int dNumber3 = 3;
        int dNumber4 = 2;
        int dNumber5 = 8;
        int dNumber6 = 3;
        double dResult = dNumber1 + ((dNumber2 / (double) dNumber3) * dNumber4) - (dNumber5 % dNumber6);

        System.out.println("wynik pierwszego dzialania: -5 + 8 * 6 to " + aResult);
        System.out.println("Reszta z dzielenia przez 9 zsumowanych liczb (55 + 9) to: " + bResult);
        System.out.println("Zaokrąglony w górę wynik dzialania: 20 + -3 * (5 / 8) to " + cResultRoundUp);
        System.out.println("Wynik dzialania: 5 + ((15 / 3) * 2) - (8 % 3) to: " + dResult);

    }
}
