import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from the user till user does not press X or x

        int result = 0;

        while (true) {

            // Take input for first number or exit condition
             System.out.print("Enter first number (or X to exit): ");
            String firstInput = input.next();

            // Check for Exit condition BEFORE number conversion
            if (firstInput.equalsIgnoreCase("x")) {
                System.out.println("Calculator Closed.");
                break;
            } // equalsIgnoreCase() is used so that both uppercase and lowercase are accepted.


            // Convert to integer after checking
            int num1 = Integer.parseInt(firstInput); // Integer.parseInt() is used to convert the string input to an integer. If the input is not a valid integer, it will throw a NumberFormatException.


            // Take input for operator
            System.out.print("Enter operator (+, -, *, /, %): ");
            char op = input.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // Take inpuit for second number
                System.out.print("Enter second number: ");
                int num2 = input.nextInt();

                if (op == '+') {
                    result = num1 + num2;
                }
                if (op == '-') {
                    result = num1 - num2;
                }
                if (op == '*') {
                    result = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        result = num1 / num2;
                    }
                    else {
                        System.out.println("Cannot divide by zero!");
                        continue;
                    }
                }
                if (op == '%') {
                    result = num1 % num2;
                }

            } else {
                System.out.println("Invalid Operation!");
            }
            System.out.println("= " + result);
        }
    }
}
/*
Output:
Enter first number (or X to exit): 10
Enter operator (+, -, *, /, %): +
Enter second number: 8
= 18
Enter first number (or X to exit): 6
Enter operator (+, -, *, /, %): -
Enter second number: 6
= 0
Enter first number (or X to exit): 10
Enter operator (+, -, *, /, %): *
Enter second number: 10
= 100
Enter first number (or X to exit): 12
Enter operator (+, -, *, /, %): /
Enter second number: 2
= 6
Enter first number (or X to exit): 4
Enter operator (+, -, *, /, %): %
Enter second number: 3
= 1
Enter first number (or X to exit): x
Calculator Closed.
*/
