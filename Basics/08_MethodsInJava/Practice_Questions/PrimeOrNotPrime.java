package Practice_Questions;

import java.util.Scanner;
public class PrimeOrNotPrime {

    // Q.1 Write a java program to find whether a number is prime or not using method.

    // Q.2 Write a java program to print all 3 digit armstrong numbers using method.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean ans = isPrime(num);
        System.out.println("The number is prime: " + ans);
        /*
         Output:
         Enter a number: 13
        The number is prime: true
        */
    }
    static boolean isPrime(int num) {
        if (num <=1) {
            return false;
        }
        int c = 2;
        while (c * c <= num){
            if (num % c == 0) {
                return false;
            }
            c++;
        }
        return true;

        /*
        Example walkthrough for better understanding:
        Let's say we want to check if 29 is prime.
        - We start with c = 2.
        - 2 * 2 = 4, which is less than or equal to 29, so we check if 29 is divisible by 2.
        - 29 is not divisible by 2, so we move to c = 3.
        - 29 is not divisible by 3, so we move to c = 4.
        - 29 is not divisible by 4, so we move to c = 5.
        - 29 is not divisible by 5, so we move to c = 6.
        - Now, c * c = 36, which is greater than 29, so we stop the loop and return true, indicating that 29 is a prime number. 
        */

        // Time complexity: O(sqrt(n))

    }
}
