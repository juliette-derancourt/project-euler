import java.math.BigInteger;
import java.util.stream.Stream;

/**
 * Problem 20:
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * Find the sum of the digits in the number 100!
 */
public class Problem020 {

    private static int sumDigitsFactorial(int n) {
        return Stream.iterate(BigInteger.ONE, i -> i.add(BigInteger.ONE))
                .limit(n)
                .reduce(BigInteger.ONE, BigInteger::multiply)
                .toString()
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("The sum of the digits in the number 100! is:");
        System.out.println(sumDigitsFactorial(100));
    }

}