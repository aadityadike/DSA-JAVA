package Questions;

import java.util.Arrays;

public class BinarySearchIn2DSortedArray {
    public static void main(String[] args) {
        int[][] nums = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8, },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int target = 14;
        int[] ans = binarySearchIn2DSortedArray(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] binarySearchIn2DSortedArray(int[][] nums, int target) {
        int row = nums.length;
        int col = nums[0].length;

        if (col == 0) { // matrix may be empty.
            return new int[] { -1, -1 };
        }

        if (row == 1) {
            return search(nums, 0, 0, col - 1, target);
        }

        int rStart = 0;
        int rEnd = row - 1;
        // Let's take middle column
        int cMid = col / 2;

        // Running the loop until two row remain.
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;

            if (nums[mid][cMid] == target) {
                return new int[] { mid, cMid };
            }

            if (nums[mid][cMid] < target)
                rStart = mid;
            else
                rEnd = mid;
        }

        // you have only two rows now you can check in different segments of array.
        if (nums[rStart][cMid] == target) {
            return new int[] { rStart, cMid };
        }
        if (nums[rStart + 1][cMid] == target) {
            return new int[] { rStart + 1, cMid };
        }

        // Check in 1st Half
        if (nums[rStart][cMid - 1] >= target) {
            return search(nums, rStart, 0, cMid - 1, target);
        }
        // Check in 2st Half
        if (nums[rStart][cMid + 1] <= target && target <= nums[rStart][col - 1]) {
            return search(nums, rStart, cMid + 1, col - 1, target);
        }
        // Check in 3rd & 4th Half
        if (nums[rStart + 1][cMid - 1] >= target) {
            return search(nums, rStart + 1, 0, cMid - 1, target);
        } else {
            return search(nums, rStart + 1, cMid + 1, col - 1, target);
        }
    }

    // This will Search in particular Row. The rStart is our given Row on that row
    // we have to iterate.
    public static int[] search(int[][] nums, int rStart, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (nums[rStart][mid] == target) {
                return new int[] { rStart, mid };
            }

            if (nums[rStart][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }
}