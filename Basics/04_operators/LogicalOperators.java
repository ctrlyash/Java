import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first boolean (true/false): ");
        boolean a = input.nextBoolean();
        System.out.println("Enter second boolean (true/false): ");
        boolean b = input.nextBoolean();

        boolean andOp = a && b;
        boolean orOp = a || b;
        boolean notOp = !a;

        System.out.println("AND (a && b): " + andOp); // true only if both a and b are true
        System.out.println("OR (a || b): " + orOp); // true if at least one of a or b is true
        System.out.println("NOT (!a): " + notOp); // true if a is false, and false if a is true
    }
}
/*
O/P:-
Enter first boolean (true/false): 
true
Enter second boolean (true/false): 
false
AND (a && b): false
OR (a || b): true
NOT (!a): false
*/

