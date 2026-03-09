public class Arrays_NoColumnFixSize {
    public static void main(String[] args) {

        // Example of a Jagged 2D Array (Dynamic 2D Array) in Java
        // A jagged array means each row can have a different number of columns.

        int[][] arr = {
            {1, 2, 3, 4},   // Row 0 → 4 elements
            {5, 6},         // Row 1 → 2 elements
            {7, 8, 9}       // Row 2 → 3 elements
        };

        // Outer loop → iterates through each row
        for (int row = 0; row < arr.length; row++) {

            // Inner loop → iterates through columns of the current row
            // We use arr[row].length because each row may have a different size
            for (int col = 0; col < arr[row].length; col++) {

                // Print each element in the current row
                System.out.print(arr[row][col] + " ");
            }

            // Move to the next line after printing one complete row
            System.out.println();
        }

        /*
        Output:
        1 2 3 4
        5 6
        7 8 9
        */
    }
}
/*
Step-by-Step Workflow of the Code

1. A 2D jagged array named "arr" is created where each row can have a different number of elements.

2. The outer loop starts with row = 0 and runs until row < arr.length.
   arr.length gives the total number of rows in the array.

3. For each row, the inner loop starts with col = 0.

4. The condition col < arr[row].length ensures that the loop runs only
   for the number of elements present in that specific row.

5. Inside the inner loop, the element at position arr[row][col] is printed.

6. The inner loop continues until all elements of the current row are printed.

7. After finishing one row, System.out.println() moves the cursor to the next line.

8. The outer loop then moves to the next row and repeats the process.

9. Finally, all rows and their elements are printed in matrix form.
*/