public class FindTheRotationOfSortedArray {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 7, 7, 7, 7, 7, 8, 9, 10, 10, 10, 1, 2, 3, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        System.out.println(findTheRotationOfSortedArray(arr));
    }

    public static int findTheRotationOfSortedArray(int[] arr) {
        int pivot = findPivotDups(arr, 0, arr.length - 1);
        return pivot + 1;
    }

    public static int findPivotDups(int[] arr, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 Cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // skip duplicates
            if (arr[start] == arr[mid] && arr[end] == arr[mid]) {
                if (arr[start] > arr[start + 1])
                    return start;
                else
                    start++;

                if (arr[end] < arr[end - 1])
                    return end - 1;
                else
                    end--;
            }

            /*
             * After skipping duplicates, we are going to check weather the left side array
             * is sorted or not. Because if the left side array is sorted than we can check
             * for right side array.
             */

            if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end])
                start = mid + 1;
            else
                end = mid - 1;

        }

        return -1;
    }
}
