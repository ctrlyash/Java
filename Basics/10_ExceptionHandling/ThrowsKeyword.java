/*
Topic: throws Keyword in Java

The 'throws' keyword is used to declare exceptions.
It tells the caller of the method that this method may throw an exception.
*/

public class ThrowsKeyword {

    // Method that declares exception using 'throws'
    static void checkAge(int age) throws ArithmeticException {

        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("You can vote");
        }
    }

    public static void main(String[] args) {

        try {
            // Calling method
            checkAge(15);
        }

        catch (ArithmeticException e) {
            // Handling exception
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program ended");
    }
    // Output:
    // Exception: Not eligible to vote
    // Program ended
}
