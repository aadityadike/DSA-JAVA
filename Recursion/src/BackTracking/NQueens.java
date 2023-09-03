package BackTracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        putQueens(board, 0);
    }

    public static void putQueens(boolean[][] board, int row) {
        if (row == board.length) {
            PrintBoard(board);
            System.out.println();
            return;
        }
        for (int col = 0; col < board[0].length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                putQueens(board, row + 1);
                board[row][col] = false;
            }
        }
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {
        // CHECK FOR UP DIRECTION WHETHER ITS SAFE OR NOT.
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // CHECK FOR DIAGONAL RIGHT DIRECTION WHETHER ITS SAFE OR NOT.
        int minimumLengthOfDirectionRight = Math.min(board.length - col - 1, row);
        for (int i = 1; i <= minimumLengthOfDirectionRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        // CHECK FOR DIAGONAL LEFT DIRECTION WHETHER ITS SAFE OR NOT.
        int minimumLengthOfDirectionLeft = Math.min(col, row);
        for (int i = 1; i <= minimumLengthOfDirectionLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }
        return true;
    }

    //    PRINTING THE BOARD THAT WE GOT FROM putQueens FUNCTION
    public static void PrintBoard(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
