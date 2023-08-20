package Subsets_Subsequence;

import java.util.ArrayList;

/* Subsets for arrays & Subsequence for Stings. */
public class Subsequence {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> list = new ArrayList<>();
        subsequence("", str, list);
        System.out.printf("Subset with passing list inside parameter: %s \n", list);

        System.out.printf("Subset with passing list inside the function call: %s", subsequence("", str));
    }

    public static void subsequence(String processed, String unprocessed, ArrayList<String> list) {
        if (unprocessed.isEmpty()) {
            list.add(processed);
            return;
        }

        char firstCh = unprocessed.charAt(0);

        subsequence(processed + firstCh, unprocessed.substring(1), list);
        subsequence(processed, unprocessed.substring(1), list);
    }

    public static ArrayList<String> subsequence(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> l = new ArrayList<>();
            l.add(processed);
            return l;
        }

        char firstCh = unprocessed.charAt(0);

        ArrayList<String> right = subsequence(processed + firstCh, unprocessed.substring(1));
        ArrayList<String> left = subsequence(processed, unprocessed.substring(1));

        right.addAll(left);
        return right;
    }
}