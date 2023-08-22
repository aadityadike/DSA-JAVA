package Subsets_Subsequence;

import java.util.ArrayList;
import java.util.List;

public class IterativeSubset {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
        List<List<Integer>> ans = iterativeSubset(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> iterativeSubset(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : nums) {
            int n = outer.size();
            for (int j = 0; j < n; j++) {
                List<Integer> innerList = new ArrayList<>(outer.get(j));
                System.out.printf("outer.get: %s \n",outer.get(j));
                System.out.printf("innerList: %s \n",innerList);
                innerList.add(num);
                System.out.printf("innerList After adding number: %s \n",innerList);
                outer.add(innerList);
            }
        }
        return outer;
    }
}
