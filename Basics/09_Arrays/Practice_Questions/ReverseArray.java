import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        
        // Write a java program to reverse the array

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8}; // create an array of 10 elements

        reverse(arr); // reverse the array

        System.out.println("Reversed array: " + Arrays.toString(arr)); // print the reversed array

        // Output: Reversed array: [8, 7, 6, 5, 4, 3, 2, 1]

        // checking with array of odd elements

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // create an array of 10 elements

        reverse(arr1); // reverse the array

        System.out.println("Reversed array: " +Arrays.toString(arr1)); // print the reversed array

        // Output: Reversed array: [9, 8, 7, 6, 5, 4, 3, 2, 1]

    }

    static void reverse(int[] arr) {

        int start = 0; // start index of the array
        int end = arr.length - 1; // end index of the array

        while (start < end) {
            // swap
            int temp = arr[start]; // store the value of the first element in a temporary variable
            arr[start] = arr[end]; // replace the value of the first element with the value of the last element
            arr[end] = temp; // replace the value of the last element with the value of the temporary variable
            start++; // increment the start index
            end--; // decrement the end index
        }

    }

}
