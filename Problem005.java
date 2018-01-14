/**
 * Problem 5:
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem005 {

    private static int smallestMultipleOfAllNumbersUnder(int limit) {
        int n = limit;
        while (!isDivisibleByNumbersUnder(n, limit)) {
            n += limit;
        }
        return n;
    }

    private static boolean isDivisibleByNumbersUnder(int n, int limit) {
        for (int d=2; d<limit; d++) {
            if (n%d != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is:");
        System.out.println(smallestMultipleOfAllNumbersUnder(20));
    }

}
