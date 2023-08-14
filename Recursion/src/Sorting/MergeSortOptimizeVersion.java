package Sorting;

public class MergeSortOptimizeVersion {
    public static void mergeSortOptimizeVersion(int[] nums) {
        int start = 0;
        int end = nums.length;
        helper(nums, start, end);
    }

    public static void helper(int[] nums, int start, int end) {
        if (end - start == 1) {
            return;
        }
        int mid = start + (end - start) / 2;

        helper(nums, start, mid);
        helper(nums, mid, end);

        mergeSort(nums, start, mid, end);
    }

    public static void mergeSort(int[] nums, int s, int m, int e) {
        int[] newArr = new int[e - s];
        int pointerA = s;
        int pointerB = m;
        int pointerC = 0;

        while (pointerA < m && pointerB < e) {
            if (nums[pointerA] < nums[pointerB]) {
                newArr[pointerC] = nums[pointerA];
                pointerA++;
            } else {
                newArr[pointerC] = nums[pointerB];
                pointerB++;
            }
            pointerC++;
        }

        while (pointerA < m) {
            newArr[pointerC] = nums[pointerA];
            pointerA++;
            pointerC++;
        }
        while (pointerB < e) {
            newArr[pointerC] = nums[pointerB];
            pointerB++;
            pointerC++;
        }

        for (int i = 0; i < newArr.length; i++) {
            nums[s + i] = newArr[i];
        }

    }

}
