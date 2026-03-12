package Practice_Questions;

public class SwappingArrayElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // create an array of 10 elements

        swap(arr, 0, 9); // swap the first and last elements of the array

        System.out.println("Array after swapping: " + java.util.Arrays.toString(arr)); // print the array

        // Output: Array after swapping: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1]; // store the value of the first element in a temporary variable
        arr[index1] = arr[index2]; // replace the value of the first element with the value of the last element
        arr[index2] = temp; // replace the value of the last element with the value of the temporary variable
    }
}
