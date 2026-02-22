import java.util.Scanner;

public class BasicIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Q. Take input of two numbers and prit the sum
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        /*
        o/p:-
        Enter first number: 2
        Enter second number: 8
        The sum of 2 and 8 is: 10 
        */

        // Now suppose the question is to perform this sum operation n number of times,
        //Then the code will be very lengthy and we have to repeat the same code again and again. To avoid this we can use methods in java.

        // Syntax of method in java:-
        /*
        return_type method_name(parameters){
            body of the method
        }
        */
       // we call the methos by using the method name and passing the required parameters in the main method.
       
       // for eg:
        sumOfTwoNumbers(); // calling the method to perform the sum operation, we can call this method as many times as we want without writing the same code again and again.
        sumOfTwoNumbers();
        /* o/p:-
        Enter first number: 8
        Enter second number: 10
        The sum of 8 and 10 is: 18
        */
    }
    static void sumOfTwoNumbers() { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
    /*
     Here we use static void because we do not want to return any value from this method, we just want to perform the sum operation and print the result. 
     If we want to return the sum value to the caller, then we can use int as the return type and return the sum value from the method. We will see this in the next code snippet.
    */
    
}
