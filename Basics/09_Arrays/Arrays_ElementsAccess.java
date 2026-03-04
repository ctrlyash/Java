public class Arrays_ElementsAccess {
    public static void main(String[] args) {

        // We can access the elements of an array using their index. The index of the first element is 0, the second element is 1, and so on.
        
        int[] numbers = {1, 2, 3, 4, 5};


        // Accessing elements of the array
        System.out.println("First element: " + numbers[0]); // Output: 1
        System.out.println("Second element: " + numbers[1]); // Output: 2
        System.out.println("Third element: " + numbers[2]); // Output: 3

        // Modifying an element in the array
        numbers[2] = 10; // Changing the value at index 2 to 10
        System.out.println("Modified third element: " + numbers[2]); // Output: 10

        // Length of the array
        System.out.println("Length of the array: " + numbers.length); // Output: 5

        // Iterating through the array
        System.out.println("Elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]); // Output: 1, 2, 10, 4, 5
        }
    }
}
