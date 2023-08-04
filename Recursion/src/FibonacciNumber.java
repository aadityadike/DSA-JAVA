public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 10;
        int ans = findNthFibonacciNo(n);
        System.out.println(ans);
    }

    public static int findNthFibonacciNo(int n) {
//        Base Condition
        if(n < 2){
            return  n;
        }
        return findNthFibonacciNo(n-1) + findNthFibonacciNo(n-2);
    }
}
