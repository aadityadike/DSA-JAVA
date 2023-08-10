package Sorting;

import java.util.Arrays;

import static Sorting.Swap.swap;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 11, 23, 12};
        bubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr, int num, int i) {
        if (num == 0) {
            return;
        }
        if (i < num) {
            if (arr[i] > arr[i + 1]) {
                //Swap
                swap(arr, i, i + 1);
            }

            bubbleSort(arr, num, i + 1);
        }
        bubbleSort(arr, num - 1, 0);
    }


}
