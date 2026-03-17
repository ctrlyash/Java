/*
Topic: Try-Catch Block in Java

The try-catch block is used to handle exceptions in Java.

try block:
Contains code that may cause an exception.

catch block:
Handles the exception so that the program does not crash.
*/

public class Exp_TryCatch {
    public static void main(String[] args) {

        System.out.println("Program started");

        int a = 10;
        int b = 0;

        try {
            // Code that may cause an exception
            int result = a / b;

            System.out.println("Result: " + result);
        }

        catch (ArithmeticException e) {
            // This block executes if an exception occurs
            System.out.println("Exception caught: Cannot divide by zero");
        }

        System.out.println("Program ended normally");
    }
    // Output:
    // Program started
    // Exception caught: Cannot divide by zero
    // Program ended normally
}