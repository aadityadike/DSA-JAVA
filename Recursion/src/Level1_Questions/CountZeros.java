package Level1_Questions;

public class CountZeros {
    public static void main(String[] args) {
        int num = 9040004;
        int count = 0;
        int ans = countZeros(num, count);
        System.out.println(ans);
    }

    public static int countZeros(int num, int count) {
        int lastDigit = num % 10;
        int newNum = num / 10;

        if (num == 0) {
            return count;
        }

        if (lastDigit != 0) {
            return countZeros(newNum, count);
        }
        return countZeros(newNum, count + 1);
    }
}