// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.*;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 }; // Output: [5,6]
        List<Integer> ans = findDisappearedNumbers(nums);
        System.out.println(ans);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
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
                list.add(i + 1);
            }
        }
        return list;
    }

    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}