package Maze_Questions;

import java.util.ArrayList;

public class PathTowardsEndOfTheMaze {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.print("Printing The List of Path Towards the end of Maze: \n");
        pathTowardsEndOfTheMaze(arr.length, arr.length, "");
        System.out.println("✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅");
        System.out.printf("Printing The List of Path Towards the end of Maze: %s \n", pathTowardsEndOfTheMazeList(arr.length, arr.length, ""));
        System.out.println("✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅");
        System.out.printf("Printing The List of Path Towards the end of Maze: %s \n", pathTowardsEndOfTheMazeDiagonal("", arr.length, arr.length));
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

    public static ArrayList<String> pathTowardsEndOfTheMazeList(int row, int col, String ans) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }


        ArrayList<String> list = new ArrayList<>();
        if (col > 1) {
            list.addAll(pathTowardsEndOfTheMazeList(row, col - 1, ans + "R"));
        }
        if (row > 1) {
            list.addAll(pathTowardsEndOfTheMazeList(row - 1, col, ans + "D"));
        }

        return list;
    }

    public static ArrayList<String> pathTowardsEndOfTheMazeDiagonal(String processed, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> path = new ArrayList<>();
            path.add(processed);
            return path;
        }

        ArrayList<String> list = new ArrayList<>();

        if (row > 1 && col > 1) {
            list.addAll(pathTowardsEndOfTheMazeDiagonal(processed + "D", row - 1, col - 1));
        }
        if (col > 1) {
            list.addAll(pathTowardsEndOfTheMazeDiagonal(processed + "V", row, col - 1));
        }
        if (row > 1) {
            list.addAll(pathTowardsEndOfTheMazeDiagonal(processed + "H", row - 1, col));
        }

        return list;
    }

}
