/*
Topic: Introduction and Need of Exception Handling in Java

Exception:
An exception is an event that occurs during the execution of a program
that disrupts the normal flow of the program.

Example:
- Division by zero
- Invalid input
- Accessing invalid index in an array

Need of Exception Handling:
Without exception handling, a program crashes when an error occurs.
Exception handling allows the program to handle errors gracefully
and continue execution.
*/

public class Basics {
    public static void main(String[] args) {

        System.out.println("Program started");

        int a = 10;
        int b = 0;

        try {
            // Code that may cause an exception
            int result = a / b;

            // This line will not execute if exception occurs
            System.out.println("Result: " + result);
        }

        catch (ArithmeticException e) {
            // Handles division by zero error
            System.out.println("Error: Cannot divide by zero");
        }

        // Program continues normally after handling exception
        System.out.println("Program continues execution");
    }
}
/* Output:
Program started
Error: Cannot divide by zero
Program continues execution
*/

/*
 Explanation:
 The try block contains code that may cause an exception.
 The catch block handles the exception and prints an error message.
 The program continues to execute after the exception is handled.
*/
