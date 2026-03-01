public class VarArgsAndMethodOverloading {
    public static void main(String[] args) {
        
        // Method Overloading: It is a feature in Java that allows you to create multiple methods with the same name but different parameters.
        // The compiler determines which method to call based on the number and type of arguments passed to the method.

        // Example:

        fun(2); // Method with one integer parameter: 2
        fun(2, 3); // Method with two integer parameters: 2, 3
        fun("Hello Yash"); // Method with one string parameter: Hello Yash

        // Example of method overloading with different number of parameters:

        System.out.println(sum(2, 3)); // 5
        System.out.println(sum(2, 3, 4)); // 9
        System.out.println(sum(2, 3, 4, 5)); // 14

        // In the above example, the sum() method is overloaded with different number of parameters.
    }

    // Example of method overloading with different parameter types and counts:

    static void fun(int a) {
        System.out.println("Method with one integer parameter: " + a);
    }

    static void fun(int a, int b) {
        System.out.println("Method with two integer parameters: " + a + ", " + b);
    }

    static void fun(String s) {
        System.out.println("Method with one string parameter: " + s);
    }


    // To see example using varargs in a method, we need to define the sum() method that accepts a variable number of integer arguments using varargs. Here is how we can do it:

    static int sum(int ...v) {
        int total = 0;
        for (int i : v) {
            total += i;
        }
        return total;
    }
}
