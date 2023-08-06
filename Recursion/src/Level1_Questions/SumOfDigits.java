package Level1_Questions;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 2348;

        int ans = FindSum(n);
        System.out.println(ans);
    }

    public static int FindSum(int n) {
        int remainder = n % 10;
        int division = n / 10;

        if (division == 0) {
            return n;
        }

        return FindSum(division) + remainder;
    }
}
