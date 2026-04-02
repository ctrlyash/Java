public class Introduction {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Packages!");
        System.out.println("Packages are used to group related classes and interfaces together (Like a folder).");
        System.out.println("They help in avoiding name conflicts and controlling access.");
        System.out.println("Java has built-in packages like java.util, java.io, etc.");
        System.out.println("You can also create your own packages to organize your code.");

        // Package declaration example (uncomment if you want to use it)
        // package com.example.myapp;
        // This would be at the top of your Java file to declare that it belongs to the package com.example.myapp



        // Example of using a built-in package
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println("ArrayList from java.util package: " + list); // Output: [Hello, World]

        // Importing a package allows us to use classes without fully qualifying their names
        // import java.util.ArrayList; // Uncomment this line to import the ArrayList class(and then you can use ArrayList without the package prefix)

        // Usually, we would import the package at the top of the file like this:
        // import java.util.ArrayList;

        // We can also import classes from our own packages (if we had any) using the import statement.
        // import com.example.myapp.MyClass; // Example of importing a class from our own package

    }
}
