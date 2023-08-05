package Introduction;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12, 23, 43, 54, 65, 67, 86, 332};
        int ans = BSRec(arr, 0, arr.length - 1, 1);
        System.out.println(ans);
    }

    public static int BSRec(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] > target) {
            return BSRec(arr, start, mid - 1, target);
        }
        return BSRec(arr, mid + 1, end, target);

    }
}
