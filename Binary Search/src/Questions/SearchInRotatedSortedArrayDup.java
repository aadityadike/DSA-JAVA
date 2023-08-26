package Questions;

import java.util.ArrayList;
import java.util.Collections;

public class SearchInRotatedSortedArrayDup {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 6, 0, 0, 1, 2 };
        int target = 2;
        System.out.println(searchInRotatedSortedArrayDup(nums, target));
    }

    public static ArrayList<Integer> searchInRotatedSortedArrayDup(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        ArrayList<Integer> ans = new ArrayList<>();
        // Find pivot for duplicates.
        int pivot = findPivotDups(nums, start, end);

        // if pivot is equal to target.
        if (nums[pivot] == target) {
            ans.add(pivot);
        }
        // if target < start element
        if (nums[start] <= target) {
            binarySearch(nums, target, start, pivot - 1, ans);
        }
        if (nums[pivot + 1] <= target) {
            binarySearch(nums, target, pivot + 1, end, ans);
        }

        Collections.sort(ans);
        return ans;

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

    static ArrayList<Integer> binarySearch(int[] arr, int target, int start, int end, ArrayList<Integer> ans) {
        while (start <= end) {
            int mid = start + (end - start) / 2; // cause this may surpass the integer value.

            /*
             * check for if middle element is equal to target or not if it is equal then
             * search for left side and right side if they are equal or not.
             */
            if (arr[mid] == target) {
                ans.add(mid);

                int leftSide = mid - 1;
                while (leftSide >= start && arr[leftSide] == target) {
                    ans.add(leftSide);
                    leftSide--;
                }

                int rightSide = mid + 1;
                while (rightSide <= end && arr[rightSide] == target) {
                    ans.add(rightSide);
                    rightSide++;
                }

                return ans;

            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return null;
    }
}
