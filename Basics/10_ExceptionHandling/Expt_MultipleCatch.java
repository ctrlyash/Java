/*
Topic: Multiple Catch Blocks in Java

A try block can have multiple catch blocks to handle
different types of exceptions separately.

Each catch block handles a specific type of exception.
*/

public class Expt_MultipleCatch {
    public static void main(String[] args) {

        System.out.println("Program started");

        try {
            int[] arr = new int[5];

            // This will cause ArrayIndexOutOfBoundsException
            arr[10] = 50;

            // This will cause ArithmeticException
            int result = 10 / 0;

            System.out.println("Result: " + result);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds");
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }

        catch (Exception e) {
            // General exception (should be last)
            System.out.println("General Exception occurred");
        }

        System.out.println("Program continues normally");

        // Output:
        // Program started
        // Error: Array index is out of bounds
        // Program continues normally
    }
}
