public class Arrays_DeclnAndInitializn {
    public static void main(String[] args) {
        
        
        // Declaring and initializing an array
        int[] numbers = new int[5];

        // Or we can also declare and initialize an array using an array literal like this:
        int[] numbers2 = {1, 2, 3, 4, 5};
         

    
        // Another example of array declaration and initialization

        String[] names; // declaration of array, names is getting defined in the stack memory (compile time)
        names = new String[3]; // initialization of array, now names is getting defined in or we can say object is getting created in the heap memory (run time) also known as dynamic memory allocation (assigning memory at runtime).

        // New keyword is used to create an array object in the heap memory and it returns a reference to that object which is stored in the variable names.

        

        // Now when we look at the array numbers, it has 5 elements, but we haven't assigned any values to them yet. By default, all the elements in the array are initialized to 0 for int type.

        // Assigning values to the array
        numbers[0] = 1; // Assigning value 1 to the first element of the array
        numbers[1] = 2; // Assigning value 2 to the second element of the array
        numbers[2] = 3; // Assigning value 3 to the third element of the array
        numbers[3] = 4; // Assigning value 4 to the fourth element of the array
        numbers[4] = 5; // Assigning value 5 to the fifth element of the array

        // Similarly, default values for the names array will be null since it is an array of String objects. (null means that the reference variable is not pointing to any object in the heap memory, it is the default value of a reference variable in java.)

        // Assigning values to the names array
        names[0] = "Yash"; // Assigning value "Yash" to the first element
        names[1] = "Bunny"; // Assigning value "Bunny" to the second element
        names[2] = "Virat"; // Assigning value "Virat" to the third element
    }
}
