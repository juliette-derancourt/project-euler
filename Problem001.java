/**
 * Problem 1:
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem001 {

    private static int sumMultiples() {
        int sum = 0;
        for (int i=3; i<1000; i+=3) {
            sum += i;
        }
        for (int i=5; i<1000; i+=5) {
            sum += i;
        }
        for (int i=15; i<1000; i+=15) {
            sum -= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The sum of all the multiples of 3 or 5 below 1000 is:");
        System.out.println(sumMultiples());
    }

}
