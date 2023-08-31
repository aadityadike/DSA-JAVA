package Maze_Questions;

import java.util.ArrayList;

public class MazeWithObstetrical {
    public static void main(String[] args) {
        Boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };

        System.out.printf("Printing The List of Path Towards the end of Maze: %s \n", mazeWithObstetrical(maze, "", 0, 0));
    }

    public static ArrayList<String> mazeWithObstetrical(Boolean[][] maze, String processed, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            ArrayList<String> path = new ArrayList<>();
            path.add(processed);
            return path;
        }

        ArrayList<String> list = new ArrayList<>();
        if (maze[row][col]) {
            if (col < maze.length - 1) {
                list.addAll(mazeWithObstetrical(maze, processed + "R", row, col + 1));
            }
            if (row < maze[0].length - 1) {
                list.addAll(mazeWithObstetrical(maze, processed + "D", row + 1, col));
            }
        }

        return list;
    }
}
