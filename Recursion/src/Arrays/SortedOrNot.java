package Arrays;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 7, 8, 10};
        boolean ans = isSorted(arr);
        System.out.println(ans);
    }

    public static boolean isSorted(int[] arr) {
        int pointer = 0;
        return helper(arr, pointer);
    }

    public static boolean helper(int[] arr, int pointer) {
        if (pointer == arr.length - 1)
            return true;

        return arr[pointer] < arr[pointer + 1] && helper(arr, pointer + 1);
    }
}