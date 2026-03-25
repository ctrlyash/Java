public class IntroOOPS_Objects {
    public static void main(String[] args) {

        // Objects are instances of a class.
        // These are real world entities which have properties and behaviors.
        // Objects are created using the new keyword.
        // Objects are used to store and manipulate data.   
    
        // In the next file we'll study how to create objects and how to access the properties and methods of a class.
        
        Student stu = new Student(); // creating an object stu of the class Student

        // We can access the properties and methods of the class using the object using the dot operator.

        stu.rNumber[0] = 1;
        stu.Name[0] = "Yash";
        stu.Marks[0] = 90.5f;

        System.out.println("Roll number: " + stu.rNumber[0]);
        System.out.println("Name: " + stu.Name[0]);
        System.out.println("Marks: " + stu.Marks[0]);
        /*
        o/p:-
        Roll number: 1
        Name: Yash
        Marks: 90.5 
        */

        // Similarly we can use use this object to acces the data of other students also

        stu.rNumber[1] = 2;
        stu.Name[1] = "Virat";
        stu.Marks[1] = 95.5f;
        /*
        o/p:-
        Roll number: 2
        Name: Virat
        Marks: 95.5 
        */

    }
    static class Student{
        int[] rNumber = new int[5];
        String[] Name = new String[5];
        float[] Marks = new float[5];
    }
}
