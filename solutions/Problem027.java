/**
 * Problem 27:
 * Considering quadratics of the form: n^2 + an + b
 * where |a| < 1000 and |b| ≤ 1000,
 * find the product of the coefficients, a and b, for the quadratic expression that produces the maximum
 * number of primes for consecutive values of n, starting with n=0.
 */
public class Problem027 {

    private static int productCoeffMaxPrimes() {
        int maxPrimes = 0;
        int bestA = 0, bestB = 0;
        for (int b=2; b<=1000; b++) {
            for (int a=1-b; a<1000; a++) {
                int n = 0;
                while (isPrime(n*n + a*n + b)) {
                    n++;
                }
                if (n > maxPrimes) {
                    maxPrimes = n;
                    bestA = a;
                    bestB = b;
                }
            }
        }
        return bestA*bestB;
    }

    private static boolean isPrime(int n) {
        if (n == 2)
            return true;
        if (n <= 1 || n%2 == 0)
            return false;
        for (int i=3; i*i<=n; i+=2) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("The product of the coefficients for the quadratic expression that produces the maximum number of consecutive primes is:");
        System.out.println(productCoeffMaxPrimes());
    }

}
