import java.util.Arrays;

public class InsertionSort {
    /*
     * formula for sum of N numbers : n*(n+1)/2.
     * In Insertion Sort we are inserting elements to our left hand side sorted
     * array.
     */
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1, 5 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    // Swapping
    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
