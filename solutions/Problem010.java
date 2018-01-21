/**
 * Problem 10:
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
public class Problem010 {

    private static long sumPrimesBelow(long limit) {
        long sum = 2;
        for(int i=3; i<limit; i+=2) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isPrime(long n) {
        if (n%2 == 0) {
            return false;
        }
        for (int i=3; i*i<=n; i+=2) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("The sum of all the primes below two million is:");
        System.out.println(sumPrimesBelow(2000000));
    }

}
