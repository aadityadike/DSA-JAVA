public class IntermediatePatterns {
    public static void main(String[] args) {
        int n = 5;
        pattern28(n);
    }

    // Hollow Rhombus:
    public static void pattern28(int n) {
        // TOTAL NUMBER OF ROWS
        for (int row = 1; row <= n * 2; row++) {
            int totalColsInRow = row < n ? row : 2 * n - row;
            // TOTAL NUMBER OF SPACES FOR EACH ROW
            int totalSpacesInRow = n - totalColsInRow;

            for (int spaces = 0; spaces < totalSpacesInRow; spaces++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= n - totalSpacesInRow; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Combination of Right Triangles:
    public static void pattern5(int n) {
        // int mid = n / 2;
        // for (int i = 1; i <= mid + 1; i++) {
        // // First triangle: Increasing asterisks
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = mid; i >= 1; i--) {
        // // Second triangle: Decreasing asterisks
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row < n ? row : 2 * n - row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // Pyramid:
    public static void pattern8(int n) {
        // Number of Rows
        for (int row = 1; row <= n; row++) {
            // Number of Spaces in each Row.
            for (int space = 0; space < n - row; space++) {
                System.out.print(" ");
            }
            // Print row number of stars after the spaces. here (2*row) -1 getting odd
            // number.
            for (int col = 1; col <= (2 * row) - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
