public class Arrays_Multidimensional {
    public static void main(String[] args) {
        // A 2D array is an array that stores data in rows and columns, like a table or matrix.
        // It is a collection of 1D arrays. It is called an array of arrays because each row is itself an array.
        // It is also called a matrix because All the rows usually have the same number of elements (columns). Although it is not necessary, we can have different number of columns in each row, but it is not common.

        // Syntax to declare a 2D array:
        // dataType[][] arrayName = new dataType[no.of rows][no. of columns];

        /*
        Suppose we want to create a 2d array

                        123
                        456
                        789
        */

           
        int[][] matrix = new int[3][3]; // Declaring a 2D array with 3 rows and 3 columns respectively

        // Assigning values to the 2D array
        matrix[0][0] = 1; // Row 1, Column 1
        matrix[0][1] = 2; // Row 1, Column 2
        matrix[0][2] = 3; // Row 1, Column 3
        matrix[1][0] = 4; // Row 2, Column 1
        matrix[1][1] = 5; // Row 2, Column 2
        matrix[1][2] = 6; // Row 2, Column 3
        matrix[2][0] = 7; // Row 3, Column 1
        matrix[2][1] = 8; // Row 3, Column 2
        matrix[2][2] = 9; // Row 3, Column 3

        
        
        // We can also initialize a 2D array at the time of declaration like this:
        int[][] matrix2 = {
            {1, 2, 3}, // Row 1 (index 0)
            {4, 5, 6}, // Row 2 (index 1)
            {7, 8, 9}  // Row 3 (index 2)
        };
        
        System.out.println(matrix2[1]);
        // Output: [I@15db9742 because matrix2[1] is an array and when we print an array, it prints the reference of the array. To print the elements of the array, we can use Arrays.toString() method.

        System.out.println(java.util.Arrays.toString(matrix2[1])); // Output: [4, 5, 6]

        System.out.println(matrix2.length); // Output: 3 because there are 3 rows in the 2D array
        
        System.out.println(matrix2[0].length); // Output: 3 because there are 3 columns in the first row
    }
}
