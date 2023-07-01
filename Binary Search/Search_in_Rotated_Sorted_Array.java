public class Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(search(nums, 0));
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums, target);

        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        if (target == nums[pivot]) {
            return pivot;
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    public static int findPivot(int[] arr, int target) {
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
            if (arr[mid] < arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        // TODO

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

/*
 * #############################################################################
 */

class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums, target);
        int first = binarySearch(nums, target, 0, pivot);

        if (first != -1) {
            return first;
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    public int binarySearch(int[] nums, int target, int start, int end) {
        // TODO

        while (start <= end) {
            int mid = start + (end - start) / 2; // cause this may surpass the integer value.

            if (isAccending(nums, start, end)) { // Check for order.
                if (nums[mid] < target) {
                    start = mid + 1;
                } else if (nums[mid] > target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            } else {
                if (nums[mid] > target) {
                    start = mid + 1;
                } else if (nums[mid] < target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }

    public boolean isAccending(int[] arr, int start, int end) {
        if (arr[start] < arr[end]) {
            return true;
        }
        return false;
    }

    public int findPivot(int[] arr, int target) {
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
            if (arr[mid] < arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}