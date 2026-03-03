import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("num1: ");
        int num1 = input.nextInt();
        System.out.println("num2: ");
        int num2 = input.nextInt();

        boolean equal = (num1 == num2);
        boolean notEqual = (num1 != num2);
        boolean greater = (num1 > num2);
        boolean smaller = (num1 < num2);
        boolean greaterEqual = (num1 >= num2);
        boolean smallerEqual = (num1 <= num2);

        System.out.println("Equal: " + equal);
        System.out.println("Not Equal: " + notEqual);
        System.out.println("Greater: " + greater);
        System.out.println("Smaller: " + smaller);
        System.out.println("Greater or Equal: " + greaterEqual);
        System.out.println("Smaller or Equal: " + smallerEqual);
    }
}
/* 
O/P:-
num1: 
10
num2: 
2
Equal: false
Not Equal: true
Greater: true
Smaller: false
Greater or Equal: true
Smaller or Equal: false
*/
    