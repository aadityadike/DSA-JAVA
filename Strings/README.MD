# Why Strings are Immutable in Java - Here's the Reason

If you're new to Java programming, you might wonder why strings are immutable and why we can't modify them. In this blog post, I'll explain the reason in simple terms.

I've written article that make understanding `Strings` so Easy here is link: [Strings in Java](https://adityadike.hashnode.dev/unlocking-javas-string-secret-the-truth-about-immutability)

## Strings

In Java, a string is a type of data that refers to objects rather than holding a direct value. These types are called reference types. When we define a string, it points to a location in memory where the data is stored in the heap memory. This location represents the object's contents. So, we say a string variable is a reference to this memory location. Here's an example of how we represent strings in Java:

```java
String name = "Light Yagami"; // name is reference variable because it stores memory address of object.
```

### String Pool

Java has a concept called the "string pool." It is an area in the heap memory where string literals are stored. When we create a string using a literal, Java first checks if that literal already exists in the pool. If it does, it simply returns a reference to the existing instance. If not, it creates a new string object in the pool.

```java
public class Strings {
    public static void main(String[] args) {
        String name = "Light"; // name points to "Light" in the string pool
        String surname = "Light"; // surname also points to the same object in the string pool
        String book = new String("Light"); // This creates a new object in the heap memory.

        System.out.println(name == surname); // true
        System.out.println(name == book); // false
    }
}
```

In the above example, `book` points to a new object in the heap memory because we used the `new` keyword explicitly. It's essential to remember that string literals created with the `new` keyword are stored in the Java heap, not in the string pool.

## Pass-by-Value or Pass-by-Reference?

In Java, each variable is associated with a unique number that represents the memory address of the value it holds. For primitive variables, the memory location directly stores the actual value.

For reference variables, the memory location stores the memory address of the actual object, not the object itself. In other words, a reference variable doesn't store the object directly; it holds a reference (memory address) to the object. Here's a simple diagram to illustrate this concept:

Java always passes object references to methods by value. This means it passes the memory address of the object that the variable points to, not the variable itself or the object itself. Consequently, we cannot change the reference of a passed-in variable inside a method.

## Immutable Strings in Java

Now, let's focus on why strings are immutable in Java. When we create a string variable and assign it a value, like this:

```java
String name = "Light Yagami";
```

The string "Light Yagami" is stored in memory, and the variable `name` holds the reference to that memory address. In Java, strings are designed to be immutable, meaning once a string object is created, its value cannot be changed. If you try to modify a string, Java creates a new string object with the updated value instead of modifying the original one. Let's look at this example:

```java
public class ImmutableStrings {
    public static void main(String[] args) {
        String name = "Arima"; // name points to "Arima".
        name = "Light"; // name now points to "Light".
        System.out.println(name);
    }
}
```

In this example, first, `name` points to `Arima`. Then, in the next line, we change `name` to point to `Light`. Java creates a new object in the string pool for "Light," and `name` now points to that new object. The old object "Arima" is removed from memory by garbage collection.

This design offers several advantages, such as making strings thread-safe, ensuring security in certain scenarios, and enabling more efficient memory usage.

In conclusion, strings are immutable in Java to maintain the integrity of the data and ensure a safer programming environment. Understanding this concept will help you write better and more reliable Java programs.

## Format Specifiers

```java
    1. %c character
    2. %d decimal (integer) number (base 10)
    3. %e exponential floating-point number
    4. %f floating-point number
    5. %i integer (base 10)
    6. %o octal number (base 8)
    7. %s String
    8. %u unsigned decimal (integer) number
    9. %x number in hexadecimal (base 16)
    10. %t formats date/time
    11. %% print a percent sign
    12. \% print a percent sign
```
