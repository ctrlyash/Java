/*
Topic: Finally Block in Java

The finally block is always executed whether an exception occurs or not.

It is mainly used for:
- Closing resources
- Cleanup operations
*/

public class Finally {
    public static void main(String[] args) {

        System.out.println("Program started");

        int a = 10;
        int b = 0;

        try {
            // Code that may cause exception
            int result = a / b;
            System.out.println("Result: " + result);
        }

        catch (ArithmeticException e) {
            // Handling exception
            System.out.println("Error: Cannot divide by zero");
        }

        finally {
            // This block ALWAYS executes
            System.out.println("Finally block executed");
        }

        System.out.println("Program ended");

        // Output:
        // Program started
        // Error: Cannot divide by zero
        // Finally block executed
        // Program ended
    }
}