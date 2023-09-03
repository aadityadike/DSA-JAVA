package Maze_Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class BackTracking {
    public static void main(String[] args) {
        Boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };

//        System.out.printf("Printing The List of Path Towards the end of Maze: %s \n", allPaths(maze, "", 0, 0));
        printMaze(maze, new int[maze.length][maze[0].length], 0, 0, 1);
    }

    public static ArrayList<String> allPaths(Boolean[][] maze, String processed, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            ArrayList<String> path = new ArrayList<>();
            path.add(processed);
            return path;
        }

        ArrayList<String> ans = new ArrayList<>();

        // THE CELL THAT YOU CURRENTLY AT SHOULD BE TRUE.
        if (maze[row][col]) {

            maze[row][col] = false;

            // MOVING TOWARDS RIGHT
            if (col < maze[0].length - 1) {
                ans.addAll(allPaths(maze, processed + "R", row, col + 1));
            }
            // MOVING TOWARDS LEFT
            if (col > 0) {
                ans.addAll(allPaths(maze, processed + "L", row, col - 1));
            }
            // MOVING TOWARDS DOWN
            if (row < maze.length - 1) {
                ans.addAll(allPaths(maze, processed + "D", row + 1, col));
            }
            // MOVING TOWARDS UP
            if (row > 0) {
                ans.addAll(allPaths(maze, processed + "U", row - 1, col));
            }

            maze[row][col] = true;
        }
        return ans;
    }

    public static void printMaze(Boolean[][] maze, int[][] PrintMaze, int row, int col, int count) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            PrintMaze[row][col] = count;
            for (int[] arr : PrintMaze) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            return;
        }


        if (!maze[row][col]) {
            return;
        }
        // THE CELL THAT YOU CURRENTLY AT SHOULD BE TRUE.
        maze[row][col] = false;
        PrintMaze[row][col] = count;

        // MOVING TOWARDS RIGHT
        if (col < maze[0].length - 1) {
            printMaze(maze, PrintMaze, row, col + 1, count + 1);
        }
        // MOVING TOWARDS LEFT
        if (col > 0) {
            printMaze(maze, PrintMaze, row, col - 1, count + 1);
        }
        // MOVING TOWARDS DOWN
        if (row < maze.length - 1) {
            printMaze(maze, PrintMaze, row + 1, col, count + 1);
        }
        // MOVING TOWARDS UP
        if (row > 0) {
            printMaze(maze, PrintMaze, row - 1, col, count + 1);
        }

        maze[row][col] = true;
        PrintMaze[row][col] = 0;
    }
}