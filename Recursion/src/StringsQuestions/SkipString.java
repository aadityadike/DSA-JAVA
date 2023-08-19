package StringsQuestions;

public class SkipString {
    public static void main(String[] args) {
        String str = "Hey Aditya you are GOAT";
        System.out.print(skipString(str));
    }

    public static String skipString(String str) {
        if (str.isEmpty())
            return str;

        if (str.startsWith("Aditya"))
            return skipString(str.substring(7));
        else
            return str.charAt(0) + skipString(str.substring(1));
    }
}