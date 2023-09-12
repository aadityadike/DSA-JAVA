//  https://leetcode.com/problems/permutations/

import java.util.ArrayList;
import java.util.List;

//  Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, new ArrayList<>(), nums);
        return ans;
    }

    public static void helper(List<List<Integer>> ans, List<Integer> processed, int[] unprocessed) {
        if (unprocessed.length == processed.size()) {
            ans.add(new ArrayList<>(processed));
            return;
        }

        for (int i = 0; i < unprocessed.length; i++) {
            // INSTEAD OF REMOVING THE ELEMENTS WE ARE NOT CONSIDERING THE ELEMENTS WHO ARE ALREADY ADDED IN PROCESSED.🐸
            // NOTE: ELEMENTS ARE DISTINCT, OTHERWISE WE HAVE TO REMOVE THE ELEMENT FROM ARRAY.👀
            if (processed.contains(unprocessed[i]))
                continue;
            // SAME AS WE DID IN PERMUTATIONS.🙌
            processed.add(unprocessed[i]);
            helper(ans, processed, unprocessed);
            processed.remove(processed.size() - 1);
        }
    }
}