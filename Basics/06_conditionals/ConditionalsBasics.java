import java.util.Scanner;

public class ConditionalsBasics {
    public static void main(String[] args) {

        // If and If-else
        // If-else is a conditional statement that executes a block of code if a condition is true and another block of code if the condition is false.

        if (true) {
            System.out.println("Hello World!");
        } // Hello World!

        if (false) {
            System.out.println("Hello World!");
        } // Never executes (Dead Code)

        int a = 9;
        if (a == 10) {
            System.out.println("Hello World!");
        }
        else {
            System.out.println("Hello Java!");
        } // Hello Java!


        // if-else ladder (multiple conditions)
        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println("a is greater than b");
        }
        else if (a < b) {
            System.out.println("a is less than b");
        }
        else {
            System.out.println("a is equal to b");
        } // a is less than b



        // for loop (executes the block of code for a fixed number of times according to the condition)
        // used when number of iterations is known.

        for(int i = 1; i != 5; i++) {
            System.out.println(i);
        } 
        // 1
        // 2
        // 3
        // 4


        // foreach loop (executes the block of code for each element in the array)
        // Syntax:
        // for (iterable_type iterable_element : iterable) {
            
        // }


        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }
        // 1
        // 2
        // 3
        // 4
        // 5


        // While loop (executes the block of code as long as the condition is true)
        // used when number of iterations is not known.

        int count = 1;
        while (count != 5) {
            System.out.println(count);
            count++;
        } // 1 2 3 4


        // Do-while loop (executes the block of code once and then checks the condition)
        // it is similar to while loop but in this the block of code is executed at least once before checking the condition.

        int num = 1;
        do {
            System.out.println(num);
            num++;
        } while (num != 5); // 1 2 3 4


        // for loop (taking input from the user and printing it)

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: "); 
        int num = input.nextInt();
        for(int i = 1; i <= num; i++) {
            System.out.println(i);
        }
        //Enter a number: 10
        // 1
        // 2
        // 3
        // 4
        // 5
        // 6
        // 7
        // 8
        // 9
        // 10
    }
}