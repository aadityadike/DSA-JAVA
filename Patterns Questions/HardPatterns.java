public class HardPatterns {
    public static void main(String[] args) {
        int n = 4;
        pattern31(n);
    }

    public static void pattern30(int n) {
        // TODO
        for (int row = 1; row <= n; row++) {
            // SPACES
            for (int spaces = n - row; spaces > 0; spaces--) {
                System.out.print(" ");
            }
            // LEFT ITEMS IN EACH ROW
            for (int left = row; left > 1; left--) {
                System.out.print(left + " ");
            }

            // RIGHT ITEMS IN EACH ROW
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void pattern31(int n) {
        n *= 2;
        for (int rows = 0; rows <= n; rows++) {
            for (int cols = 0; cols <= n; cols++) {
                int min = findMin(rows, cols, n);
                System.out.print(min + " ");
            }
            System.out.println();
        }
    }

    public static int findMin(int rows, int cols, int TotalNumber) {
        int leftDistance = cols;
        int rightDistance = TotalNumber - cols;
        int topDistance = rows;
        int bottomDistance = TotalNumber - rows;

        return Math.min(Math.min(leftDistance, rightDistance), Math.min(topDistance, bottomDistance));
    }
}
