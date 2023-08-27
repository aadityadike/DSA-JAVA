package Permutations;

import java.util.ArrayList;

public class DiceThrown {
    public static void main(String[] args) {
        int Target = 4;
        ArrayList<String> ans = diceProblem("", Target);
        System.out.print(ans);
    }

    public static ArrayList<String> diceProblem(String processed, int UnProcessed) {
        if (UnProcessed == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> lists = new ArrayList<>();
        for (int i = 1; i <= UnProcessed; i++) {
            lists.addAll(diceProblem(processed + i, UnProcessed - i));
        }
        return lists;
    }
}
