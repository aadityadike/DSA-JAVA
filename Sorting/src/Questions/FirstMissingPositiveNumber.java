package Questions;// https://leetcode.com/problems/first-missing-positive/description/

public class FirstMissingPositiveNumber {
    public static void main(String[] args) {
        int[] nums = { 7, 8, 9, 11, 12 };
        int ans = firstMissingPositive(nums);
        System.out.println(ans);
    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        // simple cycle sort for sorting the current array.
        while (i < nums.length) {
            // check for negative numbers & if number is greater than length of array.
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }

        // Return the first missing number by itreating on sorted array.
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }
        return nums.length + 1;
    }

    // Swap Function
    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
