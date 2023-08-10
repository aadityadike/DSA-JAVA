package Sorting;

import java.util.Arrays;

import static Sorting.Swap.swap;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr, int num, int i, int max) {
        if (num == 0) return;

        if (num > i) {
            if (arr[max] < arr[i]) {
                selectionSort(arr, num, i + 1, i);
            }else {
                selectionSort(arr,num,i+1,max);
            }
        } else {
            swap(arr, num-1, max);
            selectionSort(arr, num - 1, 0, 0);
        }
    }
}
