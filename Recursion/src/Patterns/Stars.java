package Patterns;

public class Stars {
    public static void main(String[] args) {
        int n = 5;
        printTriangle1(n);
    }

    public static void printTriangle1(int n) {
        int col = 0;
        triangle2(n, col);
//        triangle(n, col);
    }

    // Optimise Approach
    public static void triangle(int row, int col) {
        // Base Condition
        if (row == 0) {
            return;
        }

        if (col >= row) {
            System.out.println();
            triangle(row - 1, 0);
        } else {
            System.out.print("* ");
            triangle(row, col + 1);
        }
    }

    // Optimise Approach
    public static void triangle2(int row, int col) {
        // Base Condition
        if (row == 0) {
            return;
        }

        if (col >= row) {
            triangle2(row - 1, 0);
            System.out.println();
        } else {
            triangle2(row, col + 1);
            System.out.print("* ");
        }
    }

    // Simple Approach
    public static void printTriangle(int n) {
        // Base Condition
        if (n > 5) {
            return;
        }

        for (int col = 0; col < n; col++) {
            System.out.print("* ");
        }

        System.out.println();
        printTriangle(n + 1);
    }
}
