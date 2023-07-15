import java.util.Arrays;

public class CycleSort {
    /*
     * This will work for 1-N continues numbers.
     * Time complexity is less than other sorting algorithms. O(n)
     * This will not work for 0 & negative numbers.
     */
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 2, 1, 3 };
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cycleSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
