# Strings are immutable in Java - here is reason why?

As beginner java programmer you may have this question that why string are immutable? why we cannot modify them?
To answer your question i have written this blog.
I think you have little knowledge about strings but let's take a redcap of what strings are and how strings represented in memory?

String is just a non primitive data type in java. non primitive data types refer to objects and hence they are called reference types.Whenever a non-primitive data type is defined, it refers a memory location where the data is stored in heap memory i.e., it refers to the memory location where an object is placed. Therefore, a non-primitive data type variable is also called referenced data type

Each variable is attached to a unique number which represents the physical address of the memory location containing value for that variable. For primitive variable, the memory location stores the actual value of the variable.
For reference variable, the memory location stores the memory address of the actual object. So reference variable does not store the object itself, it stores only the reference (memory address) to the object. The following diagram illustrates this concept:
In Java we represent string like this:

```java
String name = "Light Yagami";
```
