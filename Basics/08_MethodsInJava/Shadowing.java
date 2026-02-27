public class Shadowing {
    // Shadowing is a concept in Java where a local variable or a method parameter has the same name as a class variable. 
    // In such cases, the local variable or method parameter "shadows" the class variable, meaning that it takes precedence over the class variable within its scope.

    // For eg:

    static int x = 10; // This will be shadowed at line 14
    
    // we used static because we want to access it in the main method without creating an object of the class

    public static void main(String[] args) {
        System.out.println(x); // 10

        int x; // declaring a local variable 'x' that will shadow the class variable 'x'

        x = 30; // initializing the local variable 'x' with the value 30
        // The class variable at line 7 is being shadowed by this.

        System.out.println(x); // 30

        // Here, the local variable 'x' is shadowing the class variable 'x'.

        // Note: shadowing starts after declaration but scope begins from the point of initialization of the local variable. 

        // So, before line 14, the class variable 'x' is accessible, but after line 14, the local variable 'x' is accessible.

        // And value of local variable 'x' is accessible only after it is initialized at line 16.


        // Simillarly, we can also shadow class variables in methods.

        method(); // This will call the method which has its own local variable 'x' that shadows the class variable 'x'
    }

    static void method() {
        int x = 20; // This will shadow the class variable 'x' (value: 10) within this method
        System.out.println(x); // 20
    }
}

// Note: Shadowing can lead to confusion and bugs if not used carefully, as it can make it difficult to understand which variable is being referred to in a given context. It is generally recommended to avoid shadowing class variables with local variables or method parameters to maintain code clarity.

// Summary:-

// In this code, we have a class variable 'x' with a value of 10. In the main method, we declare a local variable 'x' that shadows the class variable. When we print 'x' in the main method, it refers to the local variable, which has a value of 30. In the method() function, we declare another local variable 'x' that also shadows the class variable. When we print 'x' in the method() function, it refers to the local variable in that method, which has a value of 20.