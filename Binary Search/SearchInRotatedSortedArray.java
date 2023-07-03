public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(search(nums, 4));
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        System.out.println(pivot);

        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        if (target == nums[pivot]) {
            return pivot;
        }

        if (nums[0] <= target) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 Cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2; // cause this may surpass the integer value.

            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
