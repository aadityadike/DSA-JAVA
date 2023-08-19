package StringsQuestions;

import java.util.Objects;

public class SkipCharacter {
    public static void main(String[] args) {
        String name = "aditya";
        String ans = skipCharacter(name);
        System.out.println(ans);
        String answer = "";
        skipCharacter(name, answer);
    }

    public static String skipCharacter(String name) {
        if (Objects.equals(name, "")) return name;

        char first = name.charAt(0);
        if (first == 'd') {
            return skipCharacter(name.substring(1));
        }

        return first + skipCharacter(name.substring(1));
    }

    public static void skipCharacter(String name, String answer) {
        if (Objects.equals(name, "")) {
            System.out.println(answer);
            return;
        }

        char first = name.charAt(0);
        if (first == 'a') {
            skipCharacter(name.substring(1), answer);
        } else {
            skipCharacter(name.substring(1), answer + first);
        }

    }
}
