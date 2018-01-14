/**
 * Problem 4:
 * A palindromic number reads the same both ways. The largest palindrome made from the product of
 * two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem004 {

    private static int largestPalindrome() {
        int largest = 0;
        int n;
        for (int n1=999; n1>100; n1--) {
            for (int n2=999; n2>100; n2--) {
                n = n1*n2;
                if (isPalindrome(String.valueOf(n))
                        && n > largest) {
                    largest = n;
                }
            }
        }
        return largest;
    }

    private static boolean isPalindrome(String s) {
        int l = s.length();
        if (l == 1) {
            return true;
        }
        if (l == 2) {
            return s.charAt(0) == s.charAt(1);
        }
        return s.charAt(0) == s.charAt(l-1)
                && isPalindrome(s.substring(1,l-1));
    }

    public static void main(String[] args) {
        System.out.println("The largest palindrome made from the product of two 3-digit numbers is:");
        System.out.println(largestPalindrome());
    }

}
