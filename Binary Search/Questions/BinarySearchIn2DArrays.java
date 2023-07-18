import java.util.Arrays;

public class BinarySearchIn2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 12, 22, 34, 44, },
                { 13, 33, 44, 45 },
                { 17, 34, 47, 90 }
        };
        int target = 33;
        int[] ans = binarySearchIn2DArrays(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] binarySearchIn2DArrays(int[][] arr, int target) {
        int row = 0;
        int col = arr.length - 1;

        while (col >= 0 && row < arr.length) {
            if (target == arr[row][col]) {
                return new int[] { row, col };
            } else if (arr[row][col] > target)
                col--;
            else
                row++;

        }
        return new int[] { -1, -1 };
    }
}