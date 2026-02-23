public class PassByValue {
    public static void main(String[] args) {
        // In java, when talking about primitive data types, there is no pass by reference.
        // When we pass a variable to a method, we are passing a copy of the variable.
        // This is known as pass by value.
        // This means that any changes made to the variable inside the method will not affect the original variable outside the method.

        // We will see this with an example:-

        int x = 6;
        int y = 7;

        swap(x, y);
        System.out.println("x: " + x); // 6
        System.out.println("y: " + y); // 7
        // As you can see, the values of x and y are not changed after calling the swap method.
        // This is because we are passing a copy of the variables x and y to the swap method, and any changes made to the variables inside the swap method do not affect the original variables outside the method.

        // Similarly, understanding with a string example:-
        String name = "Yash";
        changeName(name);
        System.out.println("Name: " + name); // Yash
        // Again, the value of name is not changed after calling the changeName method.
    }
    static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
    
    // Now let's see another example:-
    static void changeName(String name) {
        name = "John";

        // here we can changr the parameter 'name' and variable 'name' to any other name for suppose 'newName' to avoid confusion, but it will not change the original variable 'name' in the main method.

        // As newname is a new object and it will not affect the original variable 'name' in the main method.

        // The output will still be "Yash" because we are passing a copy of the variable 'name' to the changeName method, and any changes made to the variable inside the changeName method do not affect the original variable outside the method.
    }
}

// Note: The above rules apply to primitive data types only.
