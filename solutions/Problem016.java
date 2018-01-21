import java.math.BigInteger;

/**
 * Problem 16:
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 2^1000?
 */
public class Problem016 {

    private static int sumDigitsPow(int n, int pow) {
        return new BigInteger(String.valueOf(n))
                .pow(pow)
                .toString()
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("The sum of the digits of the number 2^1000 is:");
        System.out.println(sumDigitsPow(2, 1000));
    }

}
