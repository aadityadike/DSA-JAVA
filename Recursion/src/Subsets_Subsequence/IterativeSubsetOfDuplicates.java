package Subsets_Subsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterativeSubsetOfDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> ans = iterativeSubsetDuplicates(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> iterativeSubsetDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = 0;
            if (i > 0 && nums[i] == nums[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();

            for (int j = start; j < n; j++) {
                List<Integer> innerList = new ArrayList<>(outer.get(j));
                innerList.add(nums[i]);
                outer.add(innerList);
            }
        }
        return outer;
    }
}
