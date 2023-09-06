package BackTracking;

public class NKnights {
    public static void main(String[] args) {
        int n = 3;
        boolean[][] board = new boolean[n][n];
        putNKnights(board, 0, 0, 5);
        System.out.println("Total solutions found: " + count);
    }

    // Initialize the count of solutions
    static int count = 0;

    public static void putNKnights(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            printKnights(board);
            // Print the chessboard when all knights are placed
            System.out.println();
            // Increment the count of solutions
            count += 1;
            return;
        }

        if (row == board.length - 1 && col == board.length) return;

        if (col == board.length) {
            putNKnights(board, row + 1, 0, knights);
            return;
        }

        if (isSafe(board, row, col)) {
            // Place a knight on the current position
            board[row][col] = true;
            putNKnights(board, row, col + 1, knights - 1);
            // Backtrack and remove the knight from the current position
            board[row][col] = false;
        }

        // Continue without placing a knight
        putNKnights(board, row, col + 1, knights);
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }
        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }
        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValid(boolean[][] board, int row, int col) {
        return 0 <= row && row < board.length && 0 <= col && col < board[0].length;
    }

    public static void printKnights(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("\uD83C\uDF1F ");
                }
            }
            System.out.println();
        }
    }
}
