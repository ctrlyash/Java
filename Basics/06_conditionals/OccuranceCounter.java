import java.util.Scanner;
public class OccuranceCounter {
    public static void main(String[] args) {
        // Count the number of times a digit occurs in a number

       Scanner input = new Scanner(System.in);

       System.out.println("Enter a number: ");
       long n = input.nextLong();

       System.out.println("Enter the digit to count: ");
       int digit = input.nextInt();
       
       int count = 0;

       while (n > 0) {
        int rem = (int)(n % 10); // we get the last digit of the number by taking the modulus with 10
        if (rem == digit) {
            count++;
        }
        n = n / 10; // we divide the number by 10 to remove the last digit and continue the process until n becomes 0
       }
       System.out.println("Count of " + digit + " is: " + count);
    }
    /* 
    O/P:-
    162636465667686960 
    Enter the digit to count: 
    6
    Count of 6 is: 9 
    */
}
