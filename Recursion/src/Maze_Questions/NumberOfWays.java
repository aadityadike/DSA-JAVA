package Maze_Questions;

public class NumberOfWays {
    public static void main(String[] args) {
        int[][] maze = new int[3][3];
        int ans = numberOfWays(maze.length, maze.length);
        System.out.print(ans);
    }

    public static int numberOfWays(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }

        int right = numberOfWays(row, col - 1);
        int down = numberOfWays(row - 1, col);

        return right + down;
    }
}