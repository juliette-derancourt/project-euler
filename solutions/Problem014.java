/*
The following iterative sequence is defined for the set of positive integers:
	n → n/2 (n is even)
	n → 3n + 1 (n is odd)
Using the rule above and starting with 13, we generate the following sequence:
	13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
Although it has not been proved yet (Collatz Problem), it is thought that all starting
numbers finish at 1. Which starting number, under one million, produces the longest chain?
*/
public class Problem014 {

    private static int longestChain(int maximum) {
        int longest = 0;
        int startingNumber = -1;
        for (int i=1; i<maximum; i++) {
            int result = collatzSequenceLength(i);
            if (result > longest) {
                longest = result;
                startingNumber = i;
            }
        }
        return startingNumber;
    }

    private static int collatzSequenceLength(int startingNumber) {
        long number = startingNumber;
        int length = 1;
        while (number != 1) {
            if (number%2 == 0)
                number = number/2;
            else
                number = 3*number + 1;
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println("The starting number, under one million, that produces the longest chain is:");
        System.out.println(longestChain(1000000));
    }

}
