/**
 * Problem 17:
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words,
 * how many letters would be used?
 */
public class Problem017 {

    private static int lettersNumbersUnder1000() {
        int letters = 0;
        for (int number=1; number<1000; number++) {
            int hundreds = number / 100;
            if (hundreds > 0) {
                // Hundred : 7 letters
                letters += letters(hundreds) + 7;
                if (number > hundreds*100) {
                    // And : 3 letters
                    letters += 3;
                }
            }
            letters += letters(number - hundreds*100);
        }
        // One thousand : 11 letters
        letters += 11;
        return letters;
    }

    // Give the number of letters used to write a two-digits number
    private static int letters(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2 || n == 6 || n == 10)
            return 3;
        if (n == 4 || n == 5 || n == 9)
            return 4;
        if (n == 3 || n == 7 || n == 8 || n == 40 || n == 50 || n == 60)
            return 5;
        if (n == 11 || n == 12 || n == 20 || n == 30 || n == 80 || n == 90)
            return 6;
        if (n == 15 || n == 16 || n == 70)
            return 7;
        if (n == 13 || n == 14 || n == 18 || n == 19)
            return 8;
        if (n == 17)
            return 9;
        return letters(n - n%10) + letters(n%10);
    }

    public static void main(String[] args) {
        System.out.println("The number of letters used to write all the numbers from 1 to 1000 is:");
        System.out.println(lettersNumbersUnder1000());
    }

}
