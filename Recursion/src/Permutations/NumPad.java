package Permutations;

import java.util.ArrayList;

public class NumPad {
    public static void main(String[] args) {
        System.out.println(numPadList("", "211"));
        System.out.println(numPadCount("", "12"));
    }

    public static void numPad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        // It will convert into Integer Value.
        // Here, we have String "12", In order to get ASCII value we need to convert it into Integer.
        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            numPad(p + ch, up.substring(1));
        }
    }

    public static ArrayList<String> numPadList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // It will convert into Integer Value.
        // Here, we have String "12", In order to get ASCII value we need to convert it into Integer.
        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(numPadList(p + ch, up.substring(1)));
        }

        return list;
    }

    public static int numPadCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        // It will convert into Integer Value.
        // Here, we have String "12", In order to get ASCII value we need to convert it into Integer.
        int digit = up.charAt(0) - '0';
        int counter = 0;
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
           counter += numPadCount(p + ch, up.substring(1));
        }

        return counter;
    }
}
