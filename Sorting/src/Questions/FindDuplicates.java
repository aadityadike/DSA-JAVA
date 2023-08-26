package Questions;// https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> ans = findDuplicates(nums);
        System.out.println(ans);
    }

    public static List<Integer> findDuplicates(int[] nums) {
        // TODO
        int index = 0;
        while (index < nums.length) {
            if (nums[index] != nums[nums[index] - 1]) {
                swap(nums, index, nums[index] - 1);
            } else {
                index++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                list.add(nums[i]);
            }
        }
        return list;
    }
    

    public static void swap(int[] nums, int first, int second) {
        int tmp = nums[first];
        nums[first] = nums[second];
        nums[second] = tmp;
    }
}
