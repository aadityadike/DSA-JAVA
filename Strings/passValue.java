import java.util.Arrays;

public class passValue {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        String s = "Aditya";
        int i = 10;
        swap(arr, s, i);
        System.out.println(Arrays.toString(arr));
        System.out.println(s);
        System.out.println(i);
    }

    static void swap(int[] arr, String s, int i) {
        arr[0] = 10;
        s = "Arima";
        i = 20;
    }
}
