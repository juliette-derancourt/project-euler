import java.math.BigInteger;

/**
 * Problem 25:
 *
 * The Fibonacci sequence is defined by the recurrence relation:
 * Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
 *
 * Hence the first 12 terms will be:
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
 *
 * The 12th term, F12, is the first term to contain three digits.
 * What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 */
public class Problem025 {

    private static int firstFibonacciToContain(int digits) {
        BigInteger prev = BigInteger.ONE;
        BigInteger f = BigInteger.ONE;
        BigInteger tmp;
        int rank = 2;
        while (f.toString().length() < 1000) {
            tmp = f;
            f = f.add(prev);
            prev = tmp;
            rank++;
        }
        return rank;
    }

    public static void main(String[] args) {
        System.out.println("The first term in the Fibonacci sequence to contain 1000 digits is:");
        System.out.println(firstFibonacciToContain(1000));
    }

}
