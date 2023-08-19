package StringsQuestions;

public class SkipMeaninglessString {
    public static void main(String[] args) {
        String str = "Hey Adi you are GOAT";
        System.out.print(skipMeaninglessString(str));
    }

    public static String skipMeaninglessString(String str) {
        if (str.isEmpty())
            return str;

        if (str.startsWith("Adi") && !str.startsWith("Aditya"))
            return skipMeaninglessString(str.substring(4));

        else
            return str.charAt(0) + skipMeaninglessString(str.substring(1));
    }
}
