package Level1_Questions;

public class PalindromicNumber {
    public static void main(String[] args) {
        int n = 987;
        int numberOfArgs = (int) Math.log10(n);
        int reversed = reversed(n, numberOfArgs);

//        System.out.println(reversed == n);

        // Recursive Approach
        boolean ans = palindrome(n);
        System.out.println(ans);
    }

    public static int reversed(int n, int numOfArgs) {
        int remainder = n % 10;
        int division = n / 10;

        if (division == 0) {
            return n;
        }

        return remainder * (int) (Math.pow(10, numOfArgs)) + reversed(division, numOfArgs - 1);
    }

    public static boolean palindrome(int num) {
        if (num == 0) {
            return true;
        }

        int FirstDigit = findFirstDigit(num); // Take the first Digit from num.
        int LastDigit = num % 10; // Take the last Digit from num.

        if (FirstDigit != LastDigit) {
            return false;
        }

        num /= 10; // This will remove the last digit from the num.
        int newNum = num - (int) ((Math.pow(10, Math.log10(num))) * FirstDigit); // This will remove the First Digit from the num.
        return palindrome(newNum);
    }

    static int findFirstDigit(int num) {
        while (num >= 10) {
            num = num / 10;
        }
        return num;
    }

}
