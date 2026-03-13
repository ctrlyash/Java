public class MaximumElement {
    public static void main(String[] args) {

        // Write a Java program to find the maximum element in an array.

        int[] arr = {1, 243, 34, 4, 5, 996, 75, 86, 9, 100}; // create an array of 10 elements

        System.out.println(max(arr)); // print the maximum element of the array

        // Output: 996

        // Write a Java program to find the maximum element in a range of an array.

        System.out.println(maxRange(arr, 2, 5)); // print the maximum element of the array from index 2 to index 5

        // Output: 75
    }

    // Method to find the maximum element in an array.

    static int max(int[] arr) {
        int max = arr[0]; // assume the first element is the maximum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // update the maximum element if a larger element is found
            }
        }
        return max;
    }

    // Method to find the maximum element in a range of an array.

    static int maxRange(int[] arr, int start, int end) {
        // edgecases
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        if (start < 0) {
            start = 0;
        }
        if (end > arr.length - 1) {
            end = arr.length - 1;
        }

        // main logic
        
        int max = arr[start]; // assume the first element is the maximum element
        for (int i = 1; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i]; // update the maximum element if a larger element is found
            }
        }
        return max;
    }

}
/*
Edge cases:- means that the program will handle unexpected or invalid inputs. (Implementing edge cases in MaxRange method)

1. If the array is empty, return -1.
2. If the start index is greater than the end index, swap them.
3. If the start index is negative, make it 0.
4. If the end index is greater than the length of the array, make it the length of the array.

*/