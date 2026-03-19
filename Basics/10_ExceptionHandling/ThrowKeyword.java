/*
Topic: throw Keyword in Java

The 'throw' keyword is used to explicitly throw an exception.

We can create our own exception and throw it manually.
*/

public class ThrowKeyword {
    public static void main(String[] args) {

        int age = 15;

        try {
            // Manually throwing an exception
            if (age < 18) {
                throw new ArithmeticException("Not eligible to vote");
            }

            System.out.println("You can vote");
        }

        catch (ArithmeticException e) {
            // Handling the thrown exception
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program ended");
    }
    // Output:
    // Exception: Not eligible to vote
    // Program ended
}
