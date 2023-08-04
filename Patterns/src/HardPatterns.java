import java.lang.Character;;

public class HardPatterns {
    public static void main(String[] args) {
        int n = 5;
        pattern16(n);
    }

    // Pascal's Triangle:
    public static void pattern16(int n) {
        for (int row = 0; row <= n; row++) {
            // SPACES
            for (int spaces = n - row; spaces > 0; spaces--) {
                System.out.print(" ");
            }

            // Logic
            int num = 1;
            for (int col = 0; col <= row; col++) {
                System.out.print(num + " ");
                num = num * (row - col) / (col + 1);
            }

            System.out.println();
        }
    }

    public static void pattern33(int n) {
        char c = 'A';
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= row; col++) {
                if (Character.isLowerCase(c)) {
                    c = Character.toUpperCase(c);
                } else {
                    c = Character.toLowerCase(c);
                }

                System.out.print(c + " ");
                c = (char) (c + 1);
            }
            System.out.println();
        }

    }

    // Number Triangle with Mirror Image:
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
        int orignalValueOfN = n;
        n *= 2;
        for (int rows = 0; rows <= n; rows++) {
            for (int cols = 0; cols <= n; cols++) {
                int min = orignalValueOfN - findMin(rows, cols, n);
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
