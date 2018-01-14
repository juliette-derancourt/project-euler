/**
 * Problem 3:
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem003 {

    private static long largestPrimeFactor(long n) {
        long largestFactor = 1;
        if (n%2 == 0) {
            largestFactor = 2;
        }
        for (long p=3; p*p<n; p+=2) {
            if (n%p == 0 && isPrime(p)) {
                largestFactor = p;
            }
        }
        return largestFactor;
    }

    private static boolean isPrime(long n) {
        // n is always an odd number >= 3
        for (int i=3; i*i<n; i+=2) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("The largest prime factor of the number 600851475143 is:");
        System.out.println(largestPrimeFactor(600851475143L));
    }

}
