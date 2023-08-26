package Permutations;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        List<String> ans = viewPermutationList("", str);
        System.out.println(ans);
    }

    public static void viewPermutations(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unProcessed.charAt(0);

        for (int i = 0; i <= processed.length(); i++) {
            String str = unProcessed.substring(1);
            String newString = processed.substring(0, i) + ch + processed.substring(i);
            viewPermutations(newString, str);
        }
    }

    public static List<String> viewPermutationList(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        List<String> list = new ArrayList<>();
        char ch = unProcessed.charAt(0);

        for (int i = 0; i <= processed.length(); i++) {
            String str = unProcessed.substring(1);
            String newString = processed.substring(0, i) + ch + processed.substring(i);
            list.addAll(viewPermutationList(newString, str));
        }
        return list;
    }

    public static int HowManyPermutation(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            return 1;
        }

        char ch = unProcessed.charAt(0);
        int counter = 0;
        for (int i = 0; i <= processed.length(); i++) {
            String str = unProcessed.substring(1);
            String newString = processed.substring(0, i) + ch + processed.substring(i);
            counter += HowManyPermutation(newString, str);
        }
        return counter;
    }
}
