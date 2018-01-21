import java.math.BigInteger;

/**
 * Problem 15:
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner.
 * How many such routes are there through a 20×20 grid?
 */
public class Problem015 {

    private static BigInteger numberOfRoutes(int sizeGrid) {
        // One route is a sequence of sizeGrid*2 movements:
        // sizeGrid down and sizeGrid to the right, in any order.
        // We just need to calculate how many such combinations exist,
        // which correspond to a binomial coefficient:
        return binomialCoefficient(sizeGrid, sizeGrid*2);
    }

    private static BigInteger binomialCoefficient(int k, int n) {
        BigInteger coefficient = BigInteger.ONE;
        for (int i=n; i>n-k; i--) {
            coefficient = coefficient.multiply(new BigInteger(String.valueOf(i)));
        }
        for (int i=k; i>1; i--) {
            coefficient = coefficient.divide(new BigInteger(String.valueOf(i)));
        }
        return coefficient;
    }

    public static void main(String[] args) {
        System.out.println("Starting in the top left corner of a 20×20 grid, the number of routes to the bottom right corner is:");
        System.out.println(numberOfRoutes(20));
    }

}
