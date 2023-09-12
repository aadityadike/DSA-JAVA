import java.util.ArrayList;
import java.util.Arrays;

//  https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
public class KWeakestRows {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 0}, {1, 0}, {1, 0}, {1, 1}
        };
        System.out.println(Arrays.toString(kWeakestRowsOptimise(mat, 4)));
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        return helper(mat, k, new ArrayList<Integer>());
    }

    public static int[] helper(int[][] mat, int k, ArrayList<Integer> soldiers) {
        for (int[] row : mat) {
            soldiers.add(numberOfSoldiersInARow(row));
        }
//        System.out.println(soldiers);

        int[] ans = new int[k];
        smallestElements(soldiers, ans, new ArrayList<>(), k);
        return ans;
    }

    static void smallestElements(ArrayList<Integer> soldiers, int[] ans, ArrayList<Integer> validation, int k) {
        for (int i = 0; i < k; i++) {
            int min = 0;

            for (int j = 1; j < soldiers.size(); j++) {
                if (validation.contains(j)) {
                    continue;
                }
                if (validation.contains(min)) {
                    min = +j;
                }

                if (soldiers.get(j) < soldiers.get(min)) {
                    min = j;
                }
            }
            ans[i] = min;
            validation.add(min);
        }
    }

    public static int numberOfSoldiersInARow(int[] row) {
        int count = 0;
        for (int element : row) {
            if (element == 1) {
                count += 1;
            }
        }
        return count;
    }




    public static int[] kWeakestRowsOptimise(int[][] mat, int k) {
        int[] soldiers = new int[mat.length];

        // count number of soldiers in each row by finding the ceiling of 1
        for (int i = 0; i < mat.length; i++) {
            soldiers[i] = ceil(mat[i]);
        }

        int[] weakOrder = new int[k];
        // based on minimum soldiers index fill the weakOrder array
        for (int i = 0; i < k; i++) {
            int minIndex = min(soldiers);
            soldiers[minIndex] = -1;
            weakOrder[i] = minIndex;
        }

        return weakOrder;
    }

    public static int ceil(int[] row){
        int start = 0;
        int end = row.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(row[mid] < 1){
                end = mid - 1;
            } else {
                start = mid +1;
            }
        }

        return start;
    }

    public static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0 && arr[i] < min){
                min = arr[i];
                index = i;
            }
        }

        return index;
    }
}


