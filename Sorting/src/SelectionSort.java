import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Selection Sort: Pick element and put it on correct index.
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Find the maximum element from remaining array and swap with correct index.
            int last = arr.length - i - 1;
            int maximum = getMaximum(arr, 0, last);
            swap(arr, maximum, last);
        }
    }

    // Swap Elements
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // Getting the maximum element from given range of Array.
    public static int getMaximum(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}