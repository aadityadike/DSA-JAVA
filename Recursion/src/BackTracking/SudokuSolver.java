package BackTracking;

public class SudokuSolver {
    public static void main(String[] args) {
        String[][] board = {
                {"5", "3", ".", ".", "7", ".", ".", ".", "."},
                {"6", ".", ".", "1", "9", "5", ".", ".", "."},
                {".", "9", "8", ".", ".", ".", ".", "6", "."},
                {"8", ".", ".", ".", "6", ".", ".", ".", "3"},
                {"4", ".", ".", "8", ".", "3", ".", ".", "1"},
                {"7", ".", ".", ".", "2", ".", ".", ".", "6"},
                {".", "6", ".", ".", ".", ".", "2", "8", "."},
                {".", ".", ".", "4", "1", "9", ".", ".", "5"},
                {".", ".", ".", ".", "8", ".", ".", "7", "9"},
        };
        sudokuSolved(board);
    }

    public static void sudokuSolved(String[][] board) {
        if (solveSudoku(board)) {
            display(board);
        } else {
            System.out.println("Unable to solve Sudoku ⛔");
        }
    }

    public static boolean solveSudoku(String[][] board) {
        int row = -1;
        int col = -1;
        int n = board.length;
        boolean emptyLeft = true;

        // SEE WHICH CELLS ARE EMPTY ⛔
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j].equals(".")) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }

            if (!emptyLeft) {
                break;
            }
        }

        // IF THERE ARE NO EMPTY ELEMENTS.
        if (emptyLeft) {
            return true;
        }

        for (int number = 1; number <= 9; number++) {
            String num = String.valueOf(number);
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;
                if (solveSudoku(board)) {
                    return true;
                } else {
                    board[row][col] = ".";
                }
            }
        }
        return false;
    }

    public static boolean isSafe(String[][] board, int row, int col, String target) {

        // FOR ROW
        for (String[] strings : board) {
            if (strings[col].equals(target)) {
                return false;
            }
        }
        // FOR COLUMN
        for (int i = 0; i < board.length; i++) {
            if (board[row][i].equals(target)) {
                return false;
            }
        }

        // FOR ENTIRE GRID 🎛
        int sqrt = (int) (Math.sqrt(board.length)); // IN OUR CASE ITS ALWAYS GOING TO BE 3.
        int rowForGrid = row - row % sqrt;
        int colForGrid = col - col % sqrt;

        for (int i = rowForGrid; i < rowForGrid + sqrt; i++) {
            for (int j = colForGrid; j < colForGrid + sqrt; j++) {
                if (board[i][j].equals(target)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void display(String[][] board) {
        for (String[] row : board) {
            for (String element : row) {
                System.out.print(element + " | ");

            }
            System.out.println("\n-----------------------------------");
        }
        System.out.println();
    }
}
