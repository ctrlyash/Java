import java.util.Arrays;
public class Arrays_ModifyByMethod {
    public static void main(String[] args) {
        
        // When we pass an array to a method, we are passing the reference of the array. This means that any changes made to the array inside the method will affect the original array outside the method.

        int[] nums = {3 , 4 , 5 , 12};

        System.out.println(Arrays.toString(nums)); // [3, 4, 5, 12]

        change(nums); // Passing the reference of the array to the method change() as an argument

        System.out.println(Arrays.toString(nums)); // [3, 4, 183, 12] because we have changed the value of index 2 in the change method

    }
    
    static void change(int[] arr) {
        arr[2] = 183;
    }

    // This method takes an array as a parameter and changes the value of index 2 to 183
}
