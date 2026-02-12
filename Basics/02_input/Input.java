import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("You entered: " + num);
    }
}

// O/P:-
// Enter a number: 5
// You entered: 5

// Notes:-
// Scanner is a class that is used to take input from the user

// input is an object of the class Scanner

// System.in is a static field of the class System that is used to take input from the user
// Difference b/w System.in and System.out is that System.in is used to take input from the user whereas System.out is used to print the output

// nextInt() is a method of the class Scanner that is used to take input as an integer from the user
// next() is a method of the class Scanner that is used to take input from the user as string



