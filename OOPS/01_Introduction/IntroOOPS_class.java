public class IntroOOPS_class {
    public static void main(String[] args) {
        
        // Class is named group of properties and methods. 
        // It is a blueprint for creating objects.
        // Properties and methods are called members of a class. These are defined inside the class body.
        // Class keyword is used to define a class.

        /*
        
        syntax:- class className{
             properties and methods 
         }

        */

    }
    // For Example creating a basic class of student.
    class Student{
        int rNumber;
        String Name;
        float Marks; 
    }

    // Above is a basic class in which we have 3 properties and 0 methods.

    // We can also create a class in which we have properties and methods.

    class Student2{
        int rNumber;
        String Name;
        float Marks;
        void printDetails(){
            System.out.println("Roll number: " + rNumber);
            System.out.println("Name: " + Name);
            System.out.println("Marks: " + Marks);
        }
    } 
    // Above is a class in which we have 3 properties and 1 method.

    // We can also take non-primitive data types as properties in a class.
    // For eg:-

    static class Student3{
        int[] rNumber = new int[5];
        String[] Name = new String[5];
        float[] Marks = new float[5];
    } // static keyword is used to declare a class as static(can be accessed without creating an object of the class which means in simple words it is a global variable of the class i.e. all objects of the main class can access its properties).
}

// In the next file we'll study how to create objects and how to access the properties and methods of a class.