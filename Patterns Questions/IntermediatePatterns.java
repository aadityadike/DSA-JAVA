public class IntermediatePatterns {
    public static void main(String[] args) {
        int n = 8;
        pattern1(n);
    }

    // Combination of Right Triangles:
    public static void pattern1(int n) {
        int mid = n / 2;
        for (int i = 1; i <= mid + 1; i++) {
            // First triangle: Increasing asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = mid; i >= 1; i--) {
            // Second triangle: Decreasing asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
