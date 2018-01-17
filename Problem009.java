/**
 * Problem 9:
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Problem009 {

    private static int productPythagoreanTriplet() {
        for (int a=0; a<333; a++) {
            for (int b=a+1; b<499; b++) {
                int c = 1000 - a - b;
                if (b < c && a*a + b*b == c*c) {
                    return a*b*c;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("The product abc of the Pythagorean triplet for which a + b + c = 1000 is:");
        System.out.println(productPythagoreanTriplet());
    }

}
