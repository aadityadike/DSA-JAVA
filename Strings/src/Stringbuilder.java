public class Stringbuilder {
    public static void main(String[] args) {
        /*
         * StringBuilder is also a class similar to String. The only difference is that
         * you can modify it without creating new object.
         */
        
        StringBuilder series = new StringBuilder();
        /*
         * In this case if we were using String the series will create new object every
         * time its get updated e.g ("ab" + 'c' = "abc") in this case series was
         * pointing
         * towards "ab" then it is creating new object with 'c' and it becomes "abc",
         * now
         * series is pointing toward "abc" and "ab" does not have any reference
         * variable.
         * So in String case so much memory and time is compromised. O(n^2) Time
         * complexity. That's why we use StringBuilder.
         */

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series.append(ch + " ");
        }

        System.out.println(series.toString());
    }
}
