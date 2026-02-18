import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        long n = input.nextLong();

        long rev = 0;

        while (n > 0) {
            long rem = n % 10; // we get the last digit of the number by taking the modulus with 10
            
            rev = rev * 10 + rem; // this shifts the digits of rev to the left and adds the last digit of n to rev

            n = n / 10; // we divide the number by 10 to remove the last digit and continue the process until n becomes 0
        }
        System.out.println("Reversed number is: " + rev);
    }
    /*
    O/P:-
    Enter a number: 
    12345678
    Reversed number is: 87654321
    */
}
