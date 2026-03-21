/*
Topic: Custom Exception in Java

A custom exception is a user-defined exception created by extending
the Exception class.

It is used when built-in exceptions are not sufficient.
*/

// Creating custom exception class
class InvalidAgeException extends Exception {

    // Constructor
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class TryCustomException {

    // Method that may throw custom exception
    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(15);
        }

        catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        System.out.println("Program ended");
    }
    // Output:
    // Custom Exception: Age must be 18 or above
    // Program ended
}

/*
Step by step explanation:

1. Creating custom exception class
2. Extending Exception class
3. Creating constructor
4. Declaring method that may throw custom exception
5. Using try-catch block
6. Throwing custom exception
7. Catching custom exception
8. Printing custom exception message
9. Printing program end message
*/