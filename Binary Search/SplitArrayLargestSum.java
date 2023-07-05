// https://leetcode.com/problems/split-array-largest-sum/

/* 
* Given an integer array nums and an integer k, split nums into k non-empty subArrays such that the largest sum of any subArray is minimized.
* Return the minimized largest sum of the split.
* A subArray is a contiguous part of the array.
 */

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = { 7, 2, 5, 10, 8 };
        int k = 2;
        splitArray(nums, k);
    }

    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            int pieces = 1;
            int sum = 0;

            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }

        return -1;
    }
}