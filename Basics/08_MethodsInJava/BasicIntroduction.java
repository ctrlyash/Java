import java.util.Scanner;

public class BasicIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Q. Take input of teo numbers and prit the sum
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
        sumOfTwoNumbers(5, 10); // calling the method with arguments 5 and 10
        /* o/p:-
        first number is: 5
        second number is: 10
        The sum of 5 and 10 is: 15
        */
    }
    static void sumOfTwoNumbers(int a, int b) { 
        System.out.print("first number is: " + a);
        System.out.print("second number is: " + b);
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
    /*static is used to call the method without creating an object of the class, it belongs to the class rather than an instance of the class.

    void is used to indicate that the method does not return any value i.e. it performs some operation but does not return any value to the caller.

    when we define  method, we give parameters like int a and int b
    whereas
    when we call the method, we pass arguments like 5 and 10.
    */
}
