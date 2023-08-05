package Level1_Questions;

public class FactorialNumber {
    public static void main(String[] args) {
        int n = 1;
//        int ans = FindFactorial(n);
        int ans = Sum(n);
        System.out.println(ans);

    }

    public static int FindFactorial(int n) {
        if (n < 2) {            /* 0! = 1 */
            return 1;
        }

        return FindFactorial(n - 1) * n;
    }

    public static int Sum(int n) {
        if (n == 0) {            /* 0! = 1 */
            return 0;
        }

        return Sum(n - 1) + n;
    }
}
