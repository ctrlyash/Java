import java.util.Scanner;

public class ThreeDigitArmstrongNo {
    // Q.2 Write a java program to print all 3 digit armstrong numbers using method and also create a method to check whether a number is armstrong or not.

     /*
     An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
     */

    public static void main(String[] args) {
        // To print all 3 digit Armstrong numbers:

        armstrong();
        /*
        Output:
        153
        370
        371
        407
        */

        // To check if a specific number is an Armstrong number or not:

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three digit number: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        /*
        Output:
        Enter a three digit number: 370
        370 is an Armstrong number.
         */
    } 

    // Method to print all 3 digit Armstrong numbers:
    static void armstrong() {
        for (int i = 100; i < 1000; i++) {
            int sum = 0;
            int temp = i;
            while (temp > 0) {
                int rem = temp % 10;
                sum += rem * rem * rem;
                temp /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }

    // Method to check if a specific number is an Armstrong number or not:
    static boolean isArmstrong(int n) {
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }
        return sum == n;
    }

}
