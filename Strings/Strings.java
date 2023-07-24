public class Strings {
    public static void main(String[] args) {
        String name = "Light"; // name is pointing towards Light in string pool
        String surname = "Light"; // this surname is also pointing towards the above object in string pool
        String book = new String("Light"); // By defining new key word we are creating the new object in heap. This book
                                           // is pointing to outside the string pool

        System.out.println(name == surname); // This will return true cause they are pointing to the same object and
                                             // they have similar memory address stored inside of variable.

        System.out.println(name == book); // This will return false cause even though they are similar but they are
                                          // pointing towards diffident memory address.
    }
}