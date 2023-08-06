package Level1_Questions;

public class ReverseNum {
    static int sum = 0;

    public static void main(String[] args) {
        int n = 123;
        reverse(n);
        System.out.println(sum);
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
}
