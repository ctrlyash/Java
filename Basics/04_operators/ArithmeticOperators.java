import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("num1: ");
        int num1 = input.nextInt();
        System.out.println("num2: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;
        int pro = num1 * num2;
        float div = num1 / num2;
        int mod = num1 % num2;
        int preincrement = ++num1;
        int postincrement = num2++;
        int predecrement = --num1;
        int postdecrement = num2--;

        

        System.out.println("Sum: " + sum);
        System.out.println("Sub: " + sub);
        System.out.println("Pro: " + pro);
        System.out.println("Div: " + div);
        System.out.println("Mod: " + mod);
        System.out.println("Preincrement(num1): " + preincrement);
        System.out.println("Postincrement(num2): " + postincrement);
        System.out.println("Predecrement(num1): " + predecrement);
        System.out.println("Postdecrement(num2): " + postdecrement);
    }
}

// O/P:-
// num1: 
// 10
// num2: 
// 2
// Sum: 12
// Sub: 8
// Pro: 20
// Div: 5.0
// Mod: 0
// Preincrement(num1): 11
// Postincrement(num2): 2
// Predecrement(num1): 10
// Postdecrement(num2): 3