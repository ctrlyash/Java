import java.util.Scanner;

public class ParametersAndReturn {
    public static void main(String[] args) {
        int result = sumOfTwoNumbers(5, 10); // calling the method with arguments 5 and 10 and storing the returned value in result variable.

        // we do not need to take the input of two numbers using scanner class as we are passing the values directly to the method as arguments.

        System.out.println("The sum of 5 and 10 is: " + result); // When we print the result, it will print the returned value stored in it.
        /* o/p:-
        The sum of 5 and 10 is: 15
        */

        greet("Yash"); // calling the greet method with argument "Yash"
        /* o/p:-
        Hello, Yash! Welcome to Java programming.
        */


        String greetingMessage = greetWithInput(); // calling the greetWithInput method and storing the returned value in greetingMessage variable.
        System.out.println(greetingMessage);
        /* o/p:-
        Enter your name: Yash Dadhich
        Hello, Yash Dadhich! Welcome to Java programming.
        */
    }


    static int sumOfTwoNumbers(int a, int b) { 
        int sum = a + b;
        return sum; // returning the sum to the caller
        // the function ends after using return statement, any code written after return statement will not be executed.
    }
    /*static is used to call the method without creating an object of the class, it belongs to the class rather than an instance of the class.

    int here is the return type of the method, it means that the method returns an integer value.
    Note: if you use the return type then you have to return a value of that type from the method, otherwise it will give a compile-time error.
    In case you do not want to return any value from the method, then you can use void as the return type.

    when we define  method, we give parameters like int a and int b
    whereas
    when we call the method, we pass arguments like 5 and 10.
    */


    // Similarly, we can create a method which returns a string value, for example:

    static String greet(String name) {
        return "Hello, " + name + "! Welcome to Java programming.";
    }


    // now suppose we want to take input from the user and return it, then we can do it like this:
    static String greetWithInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        return "Hello, " + name + "! Welcome to Java programming.";
    }
}
