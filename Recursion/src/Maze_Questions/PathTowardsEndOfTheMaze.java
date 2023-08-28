package Maze_Questions;

public class PathTowardsEndOfTheMaze {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        pathTowardsEndOfTheMaze(arr.length, arr.length, "");
    }

    public static void pathTowardsEndOfTheMaze(int row, int col, String ans) {
        if (row == 1 && col == 1) {
            System.out.println(ans);
            return;
        }

        if (col > 1) {
            pathTowardsEndOfTheMaze(row, col - 1, ans + "R");
        }
        if (row > 1) {
            pathTowardsEndOfTheMaze(row - 1, col, ans + "D");
        }
    }
}
