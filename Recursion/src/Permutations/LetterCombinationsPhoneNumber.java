package Permutations;
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
import java.util.ArrayList;

public class LetterCombinationsPhoneNumber {
    public static void main(String[] args) {
        String digits = "";
        ArrayList<String> ans = letterCombinations(digits);
        System.out.print(ans);
    }

    static String[] keys = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static ArrayList<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        return helper("", digits);
    }

    public static ArrayList<String> helper(String proceesedString, String UnprocessedString) {
        if (UnprocessedString.isEmpty()) {
            ArrayList<String> listWithIndividualAnswers = new ArrayList<>();
            listWithIndividualAnswers.add(proceesedString);
            return listWithIndividualAnswers;
        }

        ArrayList<String> list = new ArrayList<>();
        int digit = UnprocessedString.charAt(0) - '0'; // Convert first Character into Integer.
        String NumPadkeys = keys[digit - 1];

        if (digit < 2) {
            list.addAll(helper(proceesedString, UnprocessedString.substring(1)));
        }

        for (int i = 0; i < NumPadkeys.length(); i++) {
            char ch = NumPadkeys.charAt(i);
            list.addAll(helper(proceesedString + ch, UnprocessedString.substring(1)));
        }
        return list;
    }
}
