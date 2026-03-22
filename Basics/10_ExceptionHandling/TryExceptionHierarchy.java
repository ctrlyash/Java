/*
Topic: Exception Hierarchy in Java

In Java, all exceptions are part of a hierarchy.

Throwable
   ├── Error
   └── Exception
         ├── Checked Exceptions
         └── Unchecked Exceptions (RuntimeException)

This program demonstrates different types of exceptions.
*/

public class TryExceptionHierarchy {
    public static void main(String[] args) {

        // Example of Unchecked Exception (RuntimeException)
        try {
            int result = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: " + e);
        }

        // Example of another Unchecked Exception
        try {
            int[] arr = new int[3];
            arr[5] = 10;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Exception: " + e);
        }

        System.out.println("Program executed successfully");
    }
    // Output:
    // Unchecked Exception: java.lang.ArithmeticException: / by zero
    // Array Exception: java.lang.ArrayIndexOutOfBoundsException: 5
}
/* 
Explanation: Hierarchy of Exceptions means that one exception can be a parent of another.
- Exception hierarchy is used to handle exceptions in Java.
- Unchecked exceptions are exceptions that are not handled by the program.
- Checked exceptions are exceptions that must be handled by the program.
*/