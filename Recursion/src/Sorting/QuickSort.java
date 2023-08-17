package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5, 3, 4, 1, 2};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;

        int pivot = nums[m];

        while (s <= e) {
            while (pivot > nums[s]) {
                s++;
            }
            while (pivot < nums[e]) {
                e--;
            }

            if (s <= e) {
                int tmp = nums[s];
                nums[s] = nums[e];
                nums[e] = tmp;
                s++;
                e--;
            }
        }

        quickSort(nums, low, e);
        quickSort(nums, s, high);
    }
}
