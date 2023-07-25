public class Performance {
    public static void main(String[] args) {
        for (int i = 0; i < 62; i++) {
            int atoz = 'A' + i;
            char atozinChar = (char) ('A' + i);
            // Printing all the char with their code.
            System.out.printf("%d: %c \n", atoz, atozinChar);
        }
    }
}
