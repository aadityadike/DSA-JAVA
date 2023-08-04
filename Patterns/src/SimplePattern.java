public class SimplePattern {
    public static void main(String[] args) {
        int n = 5;
        pattern4(n);
    }

    // Star Pattern of Right Angle Triangle.
    public static void pattern2(int n) {
        // Print Number of Rows.
        for (int rows = 1; rows <= n; rows++) {
            // Print the Number of Column.
            for (int col = 1; col <= rows; col++) {
                // Print
                System.out.print("* ");
            }
            // Print new Line after each row ending.
            System.out.println();
        }
    }

    // Star Pattern of Square Pattern.
    public static void pattern1(int n) {
        // Print Number of Rows.
        for (int rows = 1; rows <= n; rows++) {
            // Print the Number of Column.
            for (int cols = 1; cols <= n; cols++) {
                System.out.print("*");
            }
            // Print new Line after each row ending.
            System.out.println();
        }
    }

    // Star Pattern of Inverted Right Angle Triangle.
    public static void pattern3(int n) {
        // Print Number of Rows.
        for (int rows = 0; rows < n; rows++) {
            // Print the Number of Column.
            for (int col = n - rows; col > 0; col--) {
                // Print
                System.out.print("* ");
            }
            // Print new Line after each row ending.
            System.out.println();
        }
    }

    // Number Pattern of Triangle.
    public static void pattern4(int n) {
        // Print Number of Rows
        for (int rows = 1; rows <= n; rows++) {
            // Print the Number of Column.
            for (int cols = 1; cols <= rows; cols++) {
                // Print
                System.out.print(cols + " ");
            }
            // Print new Line after each row ending.
            System.out.println();
        }
    }
}