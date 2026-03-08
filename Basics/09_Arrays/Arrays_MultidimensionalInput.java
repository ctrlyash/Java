import java.util.Scanner;
import java.util.Arrays;
public class Arrays_MultidimensionalInput {
    public static void main(String[] args) {
        // We can also take input for a 2D array from the user. We can use nested loops to take input for each element of the 2D array.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        System.out.println("Enter the elements of the array:");

        // For each row
        for (int i = 0; i < rows; i++) {
            //For each column in every row
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        // In the above code, we first take the number of rows and columns as input from the user. Then we declare a 2D array with the specified number of rows and columns. We use nested loops to take input for each element of the array. 

        // i is the iterator for rows and j is the iterator for columns.

        
        // To print the array, we can use nested loops to print each element of the array.
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
        /*
         Output:
         Enter the number of rows: 2        
         Enter the number of columns: 3
         Enter the elements of the array:
         1
         2
         3
         4
         5
         6
         The array is:
         1 2 3
         4 5 6  
        */


        // To print in matrix format, we can use nested loops to print each element of the array. But using Arrays.toString() method is more convenient and readable.

        System.out.println("The array is:");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        /*
         Output:
         Enter the number of rows: 2        
         Enter the number of columns: 3
         Enter the elements of the array:
         1
         2
         3
         4
         5
         6
         The array is:
         [1, 2, 3]
         [4, 5, 6] 
        */
        

         // We can also use enhanced for loop (for-each loop) to print the array in matrix format. It is more concise and readable.
        System.out.println("The array is:");
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        /*
        Output:
        Enter the number of rows: 2        
        Enter the number of columns: 3
        Enter the elements of the array:
        1
        2
        3
        4
        5
        6
        The array is:
        [1, 2, 3]
        [4, 5, 6] 
        */

        scanner.close(); // Closing the scanner to prevent resource leaks
    }

    
    /*
    Step by step workflow of the code:
    
    1. We declare a Scanner object to take input from the user.
    2. We take the number of rows and columns as input from the user.
    3. We declare a 2D array with the specified number of rows and columns.
    4. We use nested loops to take input for each element of the array.
    5. We print the array using a loop. We use Arrays.toString() method to print each row of the array in a readable format.
    6. Finally, we close the scanner to prevent resource leaks. 
    */
}


