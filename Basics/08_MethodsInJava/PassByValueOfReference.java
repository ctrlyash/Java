import java.util.Arrays;

public class PassByValueOfReference {
    public static void main(String[] args) {
        // In java, when talking about non-primitive data types, there is no pass by reference but pass by value of reference.
        // When we pass a variable to a method, we are passing a copy of the reference to the variable.
        // This means that any changes made to the variable inside the method will affect the original variable outside the method.
        // This is because both the original variable and the parameter in the method are referencing the same object in memory.

        // We will see this with an example:-

        int[] arr = {3 , 9 , 88 , 7 , 56};
        changeArray(arr);
        System.out.println(Arrays.toString(arr)); // [100, 200, 300, 400, 500]

        // As you can see, the values of the array 'arr' are changed after calling the changeArray method.
        // This is because we are passing a copy of the reference to the variable 'arr' to the changeArray method, and any changes made to the variable inside the changeArray method will affect the original variable outside the method.

    }

    static void changeArray(int[] nums) {
        nums[0] = 100;
        nums[1] = 200;
        nums[2] = 300;
        nums[3] = 400;
        nums[4] = 500;

        // Here we are changing the values of the array 'nums' which is a reference to the original array 'arr' in the main method.

        // So, when we change the values of the array 'nums', it will also change the values of the original array 'arr' in the main method.

    }
}

// Note: The above rules apply to non-primitive data types only.
