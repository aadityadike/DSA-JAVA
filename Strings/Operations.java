import java.util.*;

public class Operations {
    public static void main(String[] args) {
        /*
         * This will convert in unicode and perform some Opreations on it like convert
         * it into hex value and then it will add and give us a result.
         */
        System.out.println('a' + 'b');
        System.out.println("a" + "b"); // This will just concat strings.

        // If empty string wasn't there it will give us an error.
        System.out.println(new HashMap<>() + "" + new ArrayList<>());
        // Type of Complex data type becomes string.
        String ans = new HashMap<>() + "" + new ArrayList<>();
        System.out.println(ans);

        /*
         * Add Operation works on primitive data types and String only.
         * There should be at least a string in addition of Complex data types.
         * If we add String in between of Two complex data types the return type of that
         * expression becomes String.
         */
    }
}
