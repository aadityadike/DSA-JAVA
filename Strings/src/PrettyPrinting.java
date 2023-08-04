public class PrettyPrinting {
    public static void main(String[] args) {
        float num = 123.14832f;

        /*
         * %c character
         * %d decimal (integer) number (base 10)
         * %e exponential floating-point number
         * %f floating-point number
         * %i integer (base 10)
         * %o octal number (base 8)
         * %s String
         * %u unsigned decimal (integer) number
         * %x number in hexadecimal (base 16)
         * %t formats date/time
         * %% print a percent sign
         * \% print a percent sign
         */

        // This is how you Format Printing.
        System.out.printf("The formatted Number: %f \n", num);
        System.out.printf("The formatted Number: %.2f \n", num);
        System.out.printf("Value of PI: %.2f \n", Math.PI);

        System.out.printf("Hello My name is %s. I am in %d rd year \n", "Aditya", 3);
    }
}
