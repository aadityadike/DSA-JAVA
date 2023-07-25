package Questions;
public class Palindrome {
    public static void main(String[] args) {
        /*
         * A string is said to be a palindrome if it is the same if we start reading it
         * from left to right or right to left. In this article, we will learn how to
         * check if a string is a palindrome in Java.
         */

        String str = "aBccba";
        boolean ans = isPalindrome(str);
        System.out.println(ans);
    }

    // Simple two pointer Algorithm
    public static boolean isPalindrome(String str) {
        // Edge cases
        if (str == null || str.length() == 0)
            return true;

        // If String has some uppercase elements
        str = str.toLowerCase();

        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
