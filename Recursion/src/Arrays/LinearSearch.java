package Arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 4, 5, 30, 123};
        System.out.printf("Searching from Start of the Array: %d \n", linearSearch(arr, 0, 4));
        System.out.printf("Searching from End of the Array: %d \n", linearSearchFromEnd(arr, arr.length - 1, 4));
        System.out.printf("Searching for many targets of the Array: %s \n", SearchForManyTargets(arr, 0, 4, new ArrayList<>()));
    }

    public static ArrayList<Integer> SearchForManyTargets(int[] arr, int pointer, int target, ArrayList<Integer> ans) {
        if (pointer == arr.length) return ans;

        if (arr[pointer] == target) {
            ans.add(pointer);
        }

        return SearchForManyTargets(arr, pointer + 1, target, ans);
    }


    public static int linearSearch(int[] arr, int pointer, int target) {
        if (pointer == arr.length) return -1;

        if (arr[pointer] == target) return pointer;

        return linearSearch(arr, pointer + 1, target);
    }

    public static int linearSearchFromEnd(int[] arr, int pointer, int target) {
        if (pointer == -1) return -1;

        if (arr[pointer] == target) return pointer;

        return linearSearchFromEnd(arr, pointer - 1, target);
    }
}
