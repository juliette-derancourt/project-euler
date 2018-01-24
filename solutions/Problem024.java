import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Problem 24:
 * A permutation is an ordered arrangement of objects.
 * For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4.
 * If all of the permutations are listed numerically or alphabetically, we call it lexicographic order.
 * The lexicographic permutations of 0, 1 and 2 are: 012, 021, 102, 120, 201, 210
 * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 */
public class Problem024 {

    private static String lexicographicPermutation(int maxDigit, int wantedRank) {
        // The number of permutations of the digits 0, 1, ... n is n!
        // So there is (n-1)! permutations starting by 0, (n-1)! starting by 1, etc...
        // Then (n-1)! * 2*(n-2)! starting by 12, or 2*(n-1)! * 4*(n-2)! starting by 24, etc...
        // We'll just find the digits one by one this way

        List<Integer> digitsToOrder = new ArrayList<>();
        for (int i=0; i<=maxDigit; i++) {
            digitsToOrder.add(i);
        }
        String solution = "";
        int rank = 0;

        // For every digit we need to find
        for (int i=maxDigit; i>=0; i--) {
            // See which one get us closest to the wanted rank
            for (int j=0; j<=maxDigit; j++) {
                if (rank + (j+1)*factorial(i) >= wantedRank) {
                    rank += j*factorial(i);
                    solution += String.valueOf(digitsToOrder.get(j));
                    digitsToOrder.remove(j);
                    break;
                }
            }
        }
        return solution;
    }

    private static int factorial(int n) {
        return n==0 ? 1 : IntStream.range(1, n+1).reduce(1, (a,b) -> a*b);
    }

    public static void main(String[] args) {
        System.out.println("The millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9 is:");
        System.out.println(lexicographicPermutation(9, 1000000));
    }

}
