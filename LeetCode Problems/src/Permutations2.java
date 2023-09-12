//  https://leetcode.com/problems/permutations-ii/

import java.util.ArrayList;
import java.util.List;

public class Permutations2 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(permuteUnique(nums));
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] bool = new boolean[nums.length];
        helper(list, new ArrayList<>(), nums, bool);
        return list;
    }

    static void helper(List<List<Integer>> finalList, ArrayList<Integer> processed, int[] unprocessed, boolean[] booleans) {
        if (processed.size() == unprocessed.length) {
            if (!finalList.contains(processed)) {
                finalList.add(new ArrayList<Integer>(processed));
            }
            return;
        }

        // SAME APPROACH THAT WE HAVE FOLLOWED IN PREVIOUS QUESTIONS 💪
        for (int i = 0; i < unprocessed.length; i++) {
            int element = unprocessed[i];
            if (booleans[i]) {
                continue;
            }
            // TAKING ANOTHER ARRAY FOR MARKING AND FLEXIBILITY 🤡
            booleans[i] = true;
            processed.add(element);
            helper(finalList, processed, unprocessed, booleans);
            // BACKTRACK 🦊
            booleans[i] = false;
            processed.remove(processed.size() - 1);
        }
    }
}
