import java.util.Scanner;

public class AssignmentOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = input.nextInt();

        num += 5;
        System.out.println("After += 5: " + num);

        num -= 3;
        System.out.println("After -= 3: " + num);

        num *= 2;
        System.out.println("After *= 2: " + num);

        num /= 4;
        System.out.println("After /= 4: " + num);

        num %= 3;
        System.out.println("After %= 3: " + num);
    }
}

/*
O/P:-
Enter number: 
10
After += 5: 15
After -= 3: 12
After *= 2: 24
After /= 4: 6
After %= 3: 0
*/
