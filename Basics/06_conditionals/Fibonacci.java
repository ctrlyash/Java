import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        // Find the nth Fibonacci number

        System.out.println("Enter the position of Fibonacci number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int prev = 0;
        int i = 1;
        int count = 2;

        while (count <= n) {
            int curr = i;
            i = i + prev;
            prev = curr;
            count ++;
        }

        System.out.println("The Fibonacci number is: " +i);
        /*
        O/P:-
        Enter the position of Fibonacci number: 
        10
        The Fibonacci number is: 55
        */
    }
    

}
