import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] nums = {
                { 12, 32, 43 },
                { 94, 22 },
                { 33, 0, 9, 423 }
        };
        int target = 423;
        int[] ans = searchIn2DArray(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchIn2DArray(int[][] nums, int target) {
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                if (target == nums[row][col]) {
                    return new int[] { row, col };
                }
            }
        }
        return null;
    }
}