public class BinarySearch {
    public static void main(String[] args) {
        // int [] arr = {3,4,5,6,7,8,9};
        int [] arr = {9,5,4,3,2,1,-1,-2};
        int target = -1;
        System.out.println(binarySearch(arr,target));
    }

    static int binarySearch(int[] arr, int target) {
        // TODO
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start) / 2; // cause this may surpass the integer value.

            if(isAccending(arr, start, end)){ // Check for order.
                if(arr[mid] < target ){ 
                    start = mid + 1;
                }else if (arr[mid] > target) {
                    end = mid -1;
                }else{
                    return mid;
                }
            }else {
                if(arr[mid] > target ){ 
                    start = mid + 1;
                }else if (arr[mid] < target) {
                    end = mid -1;
                }else{
                    return mid;
                }
            }
        }   
        return -1;
    }

    static boolean isAccending(int [] arr, int start, int end){
        if(arr[start] < arr[end]) {
            return true;
        }
        return false;
    }
}