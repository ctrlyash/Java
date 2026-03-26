import java.util.Arrays;

public class IntroOOPS_Objects {
    public static void main(String[] args) {

        // Objects are instances of a class.
        // These are real world entities which have properties and behaviors.
        // Objects are created using the new keyword.
        // Objects are used to store and manipulate data.   
    
        // In the next file we'll study how to create objects and how to access the properties and methods of a class.

        //for eg:-
        
        
        Student2[] stu2 = new Student2[5];; // creating an object stu2 of the class Student2

         System.out.println(Arrays.toString(stu2)); // [null, null, null, null, null]



        Student2 yash; // just declaring a variable of type Student2


        // the ouput above is null because the array is initialized with null values.

        // To initialize the array we need to use new keyword
        yash = new Student2();

        System.out.println(yash); // Student2@6a8b0d42 // this is the address of the object in the heap memory

        System.out.println(yash.Name); // null
        System.out.println(yash.rNumber); // 0
        System.out.println(yash.Marks); // 0.0

        // We can access the properties and methods of the class for modifying the data of the object using the dot operator.

        yash.rNumber = 1;
        yash.Name = "Yash";
        yash.Marks = 90.5f;

        System.out.println(yash.rNumber); // 1
        System.out.println(yash.Name); // Yash
        System.out.println(yash.Marks); // 90.5


    }
    
}

class Student2 {
    int rNumber;
    String Name;
    float Marks;
} 
