// https://leetcode.com/problems/missing-number/description/

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = { 3, 0, 1, 2 };
        int ans = missingNumber(nums);
        System.out.println(ans);
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        // For sorting.
        while (i < nums.length) {
            if (nums[i] != nums.length && nums[i] != nums[nums[i]]) {
                swap(nums, i, nums[i]);
            } else {
                i++;
            }
        }

        // For checking if element is there or not.
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }

    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
