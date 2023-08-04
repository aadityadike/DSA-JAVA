import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 3, 40, 1, -4, 13, 90 };
        // int[] arr = { 1, 2, 3, 4, 5 };
        bubbleSortDesc(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            /*
             * We have to ignore last element, cause after every ith iteration the largest
             * element will come at the end.
             */
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    // Swap
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            /*
             * If you did not swapped in first jth iteration, then it means the array is
             * sorted, and we don't need to check for next ith iteration.
             */
            if (!swapped) {
                break;
            }
        }
    }

    public static void bubbleSortDesc(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}