public class StaticMethods {
    public static void main(String[] args) {
        
        // Significance of Static in psvm is that it allows the main method to be called by the JVM without creating an instance of the class. This is crucial because the main method serves as the entry point of the program, and it needs to be accessible without requiring an object to be instantiated.

        //greeting(); // Error: Cannot make a static reference to the non-static method greeting() from the type StaticMethods

    }

    static  void fun() {

        //greeting(); // Error: you cant use this because it requires an object to call it and we are trying to call it from a static method without creating an object.

        StaticMethods main = new StaticMethods();

        main.greeting(); // Hello world
    }

    // we know that something which is not static belongs to the object and we need to create an object to call it but here we are trying to call a non-static method from a static context (main method) without creating an object, which is not allowed in Java.
    void greeting() {
        System.out.println("Hello world");

        fun(); // we can call static method from non-static method without creating an object because static methods belong to the class and can be accessed without creating an object.
    }

    // checking we we can use this keyword in static method or not
    static void checkThis() {
        // System.out.println(this); // Error: Cannot use 'this' in a static context

        // The 'this' keyword refers to the current instance of the class, and since static methods belong to the class rather than any particular instance, they cannot use 'this' to refer to an object. This is why we get an error when trying to use 'this' in a static method.
    }

    
}


