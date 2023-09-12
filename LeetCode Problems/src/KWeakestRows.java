import java.util.ArrayList;
import java.util.Arrays;

//  https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
public class KWeakestRows {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 0}, {1, 0}, {1, 0}, {1, 1}
        };
        System.out.println(Arrays.toString(kWeakestRows(mat, 4)));
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        return helper(mat, k, new ArrayList<Integer>());
    }

    public static int[] helper(int[][] mat, int k, ArrayList<Integer> soldiers) {
        for (int[] row : mat) {
            soldiers.add(numberOfSoldiersInARow(row));
        }
        System.out.println(soldiers);

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
}

