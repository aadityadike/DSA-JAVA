import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 5, 11 };
        int target = 10;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = { -1, -1 };
        // if the number is greater than target than we don't need to take that number.
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}