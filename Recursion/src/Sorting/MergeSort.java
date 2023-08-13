package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {4, 8, 2, 1, 6, 10};
        System.out.println(Arrays.toString(mergeSort(nums)));
    }

    public static int[] mergeSort(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }

        int m = nums.length / 2;

        int[] firstHalf = mergeSort(Arrays.copyOfRange(nums, 0, m));
        int[] secondHalf = mergeSort(Arrays.copyOfRange(nums, m, nums.length));

        return merge(firstHalf, secondHalf);

    }

    public static int[] merge(int[] firstHalf, int[] secondHalf) {
        int[] arr = new int[firstHalf.length + secondHalf.length];
        int pointerA = 0;
        int pointerB = 0;
        int pointerC = 0;


        while (pointerA < firstHalf.length && pointerB < secondHalf.length) {
            if (firstHalf[pointerA] < secondHalf[pointerB]) {
                arr[pointerC] = firstHalf[pointerA];
                pointerA++;
            } else {
                arr[pointerC] = secondHalf[pointerB];
                pointerB++;
            }
            pointerC++;
        }

        // If First half has remaining element.
        while (pointerA < firstHalf.length) {
            arr[pointerC] = firstHalf[pointerA];
            pointerA++;
            pointerC++;
        }

        // If Second half has remaining element.
        while (pointerB < secondHalf.length) {
            arr[pointerC] = secondHalf[pointerB];
            pointerB++;
            pointerC++;
        }

        return arr;
    }
}
