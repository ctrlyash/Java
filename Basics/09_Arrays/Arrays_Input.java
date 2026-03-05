import java.util.Arrays;
import java.util.Scanner;
public class Arrays_Input {
    public static void main(String[] args) {
         
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println(arr[0]);

        // Now suppose we want to store thousands of values in an array, it would be very tedious to assign values to each index one by one. In such cases, we can take input from the user using a loop.

        // Taking input from the user using Scanner class to fill the array
        int[] arr2 = new int[5];
         Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter a number: ");
            arr2[i] = sc.nextInt();
        } 

        // Printing the values of the array

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");    
        }

        /*
        Output:
        Enter a number: 100
        Enter a number: 200
        Enter a number: 300
        Enter a number: 400
        Enter a number: 500
        100 200 300 400 500  
        */

        // We can also use an enhanced for loop to print the values of the array, which is more concise and easier to read.it is also known as a for-each loop.

        /*  syntax:
        for (dataType variableName : arrayName) {
            // body of the loop
        }
        */

        for (int i : arr2) {
            System.out.print(i + " ");    
        } // This will give the same output as the previous loop.


        // We can also use the Arrays.toString() method to print the values of the array, which is more concise and easier to read. (recommended)

        System.out.println(Arrays.toString(arr2)); // This will also give the same output as the previous loops. It will print the array in a readable (adds commas and spaces) format like this: [100, 200, 300, 400, 500]


        // Now if we want to take input for an array of strings, we can do it like this:

        String[] names = new String[3];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter a name: ");
            names[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(names));

        /*
        output:
        Enter a name: Yash
        Enter a name: Bunny
        Enter a name: Virat
        [Yash, Bunny, Virat]
        */
    }
}
