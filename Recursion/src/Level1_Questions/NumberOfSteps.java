package Level1_Questions;

public class NumberOfSteps {
    public static void main(String[] args) {
        int num = 14;
        int ans = numberOfSteps(num);
        System.out.println(ans);
    }

    public static int numberOfSteps(int num) {
        int steps = 0;
        return helper(num, steps);
    }

    public static int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        // If Number is odd then make it even by subtracting it.
        if (num % 2 != 0) {
            return helper(num - 1, steps + 1);
        }
        // If Number is even then divide it.
        return helper(num / 2, steps + 1);
    }
}
