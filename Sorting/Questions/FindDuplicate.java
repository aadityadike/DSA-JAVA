// https://leetcode.com/problems/find-the-duplicate-number/submissions/

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2, 2 };
        int ans = findDuplicate1(nums);
        System.out.println(ans);
    }

    public static int findDuplicate(int[] nums) {
        // simple cycle sort
        int i = 0;
        while (nums.length > i) {
            if (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }
        // Now Array is sorted, which means duplicate element is at last index.
        return nums[nums.length - 1];
    }

    public static int findDuplicate1(int[] nums) {
        // Simple Cycle sort
        int i = 0;
        while (nums.length > i) {
            if (nums[i] != i + 1) {
                if (nums[i] != nums[nums[i] - 1]) {
                    swap(nums, i, nums[i] - 1);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    public static void swap(int[] nums, int first, int second) {
        int tmp = nums[first];
        nums[first] = nums[second];
        nums[second] = tmp;
    }
}
