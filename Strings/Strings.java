public class Strings {
    public static void main(String[] args) {
        String a = "aditya";
        String b = "aditya";
        System.out.println(a == b);
        swap(a, b);
        System.out.println("a: " + a + " , " + "b: " + b);
    }

    private static void swap(String a, String b) {
        String tmp = a;
        a = b;
        b = tmp;
    }
}