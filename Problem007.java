/**
 * Problem 7:
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
public class Problem007 {

    private static int primeNumberAt(int index) {
        int n = 3;
        int primeNumbersCount = 2;
        while (primeNumbersCount != index) {
            n += 2;
            if (isPrime(n)) {
                primeNumbersCount++;
            }
        }
        return n;
    }

    private static boolean isPrime(int n) {
        // n is always an odd number >= 3
        for (int i=3; i*i<=n; i+=2) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("The 10 001st prime number is:");
        System.out.println(primeNumberAt(10001));
    }

}
