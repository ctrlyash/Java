import java.util.Arrays;
public class VariableLengthArguments {
    public static void main(String[] args) {
        // Variable-length arguments (varargs) allow you to pass a variable number of arguments to a method.
        // Or we can say that varargs is used whrn we don't know how many arguments will be passed to the method.

        // Syntax: dataType... variableName

        // Example:
        fun(2,3,4,5,6,7,99,88); // [2, 3, 4, 5, 6, 7, 99, 88]

        printNames("Alice", "Bob", "Charlie"); // [Alice, Bob, Charlie]

        // Varargs should always be the last parameter in the method signature, and you can only have one varargs parameter in a method. If you try to have more than one varargs parameter, you will get a compile-time error.

        Multiple(1, "Hello", "Yash", "Dadhich"); // 1Hello[Yash, Dadhich]
    }

    //  Here, we are using varargs to accept a variable number of integer arguments in the fun method. The method will print the array of integers passed to it.

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    // Similarly, we can use varargs with other data types as well. For example, we can create a method that accepts a variable number of String arguments: 
    
    static void printNames(String ...names) {
        System.out.println(Arrays.toString(names));
    }

    // We can also combine varargs with other parameters in the same method. For example, we can create a method that accepts an integer, a string prefix, and a variable number of string names:
    static void Multiple(int a, String prefix, String ...names) {

        System.out.println(a + prefix + Arrays.toString(names));

        // This method will accept an integer, a string prefix, and a variable number of string names. The varargs parameter must be the last parameter in the method signature.
    }
}