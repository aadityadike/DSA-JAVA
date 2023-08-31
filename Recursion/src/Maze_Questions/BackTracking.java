package Maze_Questions;

import java.util.ArrayList;

public class BackTracking {
    public static void main(String[] args) {
        Boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };

        System.out.printf("Printing The List of Path Towards the end of Maze: %s \n", allPaths(maze, "", 0, 0));
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
}
