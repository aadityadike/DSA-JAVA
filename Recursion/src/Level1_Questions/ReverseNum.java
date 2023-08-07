package Level1_Questions;

public class ReverseNum {
    static int sum = 0;

    public static void main(String[] args) {
        int n = 49387;
/*
        reverse(n);
        System.out.println(sum);
*/

        int numberOfArgs = (int) Math.log10(n);
        int ans = reverse2(n, numberOfArgs);
        System.out.println(ans);

    }

    public static void reverse(int n) {
        int remainder = n % 10;
        int division = n / 10;

        if (division == 0) {
            sum = sum * 10 + n;
            return;
        }
        sum = sum * 10 + remainder;
        reverse(division);
    }

    public static int reverse2(int n, int numOfArgs) {
        int remainder = n % 10;
        int division = n / 10;

        if (division == 0) {
            return n;
        }

        return remainder * (int) (Math.pow(10, numOfArgs)) + reverse2(division, numOfArgs - 1);
    }

}

