import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
         // Find the largest number among a, b, and c

         System.out.println("Enter three numbers: ");

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

       

        int max = a;
        if(b > max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }

        System.out.println("The largest number is: " + max);
        /*
        O/P:-
        Enter three numbers: 
        50
        30
        20
        The largest number is: 50
        */


        // Using nested if-else

        int max2 = 0;
        if (a > b) {
            if (a > c) {
                max2 = a;
            } else {
                max2 = c;
            }
        }
        else {
            if (b > c) {
                max2 = b;
            }
            else {
                max2 = c;
            }
        }
        System.out.println("The largest number is: " + max2);
        /*
        O/P:-
        Enter three numbers: 
        40
        10
        20
        The largest number is: 40
        */
        

        // Using max method of Math class
        
        int max3 = Math.max(c,Math.max(a, b));
        System.out.println("The largest number is: " + max3);
        /*
        O/P:-
        Enter three numbers: 
        30
        15
        65
        The largest number is: 65
        */
    }
}
