package Questions;// https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class FindErrorNums {
    public static void main(String[] args) {
        int[] nums = { 8, 7, 3, 5, 3, 6, 1, 4 };
        int[] ans = findErrorNums(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }

        // Sorted Array
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return new int[] { nums[j], j + 1 };
            }
        }
        return new int[] { -1, -1 };
    }

    public static void swap(int[] nums, int first, int second) {
        int tmp = nums[first];
        nums[first] = nums[second];
        nums[second] = tmp;
    }
}