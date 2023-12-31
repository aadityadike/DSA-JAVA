# Why StringsQuestions are Immutable in Java - Here's the Reason

If you're new to Java programming, you might wonder why strings are immutable and why we can't modify them. In this blog post, I'll explain the reason in simple terms.

I've written article that make understanding `StringsQuestions` so Easy here is link: [StringsQuestions in Java](https://adityadike.hashnode.dev/unlocking-javas-string-secret-the-truth-about-immutability)

## StringsQuestions

In Java, a string is a type of data that refers to objects rather than holding a direct value. These types are called reference types. When we define a string, it points to a location in memory where the data is stored in the heap memory. This location represents the object's contents. So, we say a string variable is a reference to this memory location. Here's an example of how we represent strings in Java:

```java
String name = "Light Yagami"; // name is reference variable because it stores memory address of object.
```

### String Pool

Java has a concept called the "string pool." It is an area in the heap memory where string literals are stored. When we create a string using a literal, Java first checks if that literal already exists in the pool. If it does, it simply returns a reference to the existing instance. If not, it creates a new string object in the pool.

```java
public class StringsQuestions {
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

## Immutable StringsQuestions in Java

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

## Addition of Char

`char` is represented as Unicode values and where Unicode values are represented by `\u` followed by `Hexadecimal` values.

As any arithmetic operation on char values promoted to `int` , so the result of `'a' + 'b'` is calculated as

1. Apply the Unicode values on corresponding char using [Unicode Table](http://www.tamasoft.co.jp/en/general-info/unicode.html)

2. Apply the Hexadecimal to Decimal conversion and then perform the operation on [Decimal values](https://www.binaryhexconverter.com/hex-to-decimal-converter).

```java
    char        Unicode      Decimal
     a           0061          97
     b           0062          98  +
                              195
```

## StringBuilder

StringBuilder is a class in Java that is used to efficiently manipulate and build strings. It shares some similarities with the String class but has a crucial difference: it allows modifications without creating new objects. This results in better performance and memory efficiency.

Let's understand this with a simple example:

Consider the following code snippet using the String class:

```java
public class Test {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch + " ";
        }

        System.out.println(series);
    }
}
```

In this code, we are building the 'series' string by adding characters to it in each iteration of the loop. However, using the String class for this approach can lead to two main problems:

1. **Memory and Time Inefficiency:** With each iteration, a new string object is created to hold the updated 'series,' leading to unnecessary memory usage and time consumption.

2. **Quadratic Time Complexity:** Due to the repeated creation of new objects, the time complexity becomes O(n^2), where 'n' is the number of characters in the final series.

To overcome these issues, we use StringBuilder, as demonstrated in the following code:

```java
public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder series = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series.append(ch).append(" ");
        }

        System.out.println(series.toString());
    }
}
```

In this example, we use StringBuilder to construct the 'series' string. With each iteration, the StringBuilder object appends a new character, avoiding the creation of unnecessary string objects. This significantly improves both time and space efficiency.

By using StringBuilder, we achieve a linear time complexity of O(n) for building the 'series' string, where 'n' is the number of characters in the final series. This makes the code more efficient and scalable compared to using the String class.