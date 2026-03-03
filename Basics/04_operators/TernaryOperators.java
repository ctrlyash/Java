import java.util.Scanner;

public class TernaryOperators {

    /* 
    Ternary Operator is a shorthand for if-else statement. It takes three operands: a condition, a value to return if the condition is true, and a value to return if the condition is false. The syntax is:

    value = condition ? value_if_true : value_if_false;
    */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = input.nextInt();

        String result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println("Result: " + result);
    }
}
/*
O/P:-
Enter number: 
10
Result: Even
*/