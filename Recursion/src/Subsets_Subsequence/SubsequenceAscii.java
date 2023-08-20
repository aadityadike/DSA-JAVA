package Subsets_Subsequence;

import java.util.ArrayList;

/* Subsets for arrays & Subsequence for Stings. */
public class SubsequenceAscii {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> list = new ArrayList<>();
        subsequence("", str, list);
        System.out.printf("Subset with passing list inside parameter: %s \n", list);
    }

    public static void subsequence(String processed, String unprocessed, ArrayList<String> list) {
        if (unprocessed.isEmpty()) {
            list.add(processed);
            return;
        }

        char firstCh = unprocessed.charAt(0);

        subsequence(processed + firstCh, unprocessed.substring(1), list);
        subsequence(processed, unprocessed.substring(1), list);
        subsequence(processed + (firstCh + 0), unprocessed.substring(1), list);
    }
}