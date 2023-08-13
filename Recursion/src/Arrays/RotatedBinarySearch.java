package Arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] nums = {4, 5, 1, 2, 3};
        int target = 2;
        System.out.println(rotatedBinarySearch(nums, 0, nums.length - 1, target));
    }

    public static int rotatedBinarySearch(int[] nums, int s, int e, int target) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (nums[m] == target) {
            return m;
        }

        // First half is sorted.
        if (nums[s] < nums[m]) {
            if (nums[s] <= target && nums[m] > target) {
                return rotatedBinarySearch(nums, s, m - 1, target);
            } else {
                return rotatedBinarySearch(nums, m + 1, e, target);
            }
        }

        // First half isn't sorted.
        if (nums[m] < target && nums[e] >= target) {
            return rotatedBinarySearch(nums, m + 1, e, target);
        }

        return rotatedBinarySearch(nums, s, m - 1, target);
    }
}
