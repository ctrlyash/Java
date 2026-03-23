public class IntroductionOOPS {
    // OOPS = Object Oriented Programming System
    // OOPS is a programming paradigm that uses classes and objects to model real-world entities and their interactions.

    // Need of OOPS:
    public static void main(String[] args) {
        // Suppose we want to store roll numbers of 5 students in an array.

        int[] rollNumbers = new int[5];

       
        rollNumbers[0] = 1;
        rollNumbers[1] = 2;
        rollNumbers[2] = 3;
        rollNumbers[3] = 4;
        rollNumbers[4] = 5;

        // Now store 5 names in an array.

        String[] names = new String[5];

        names[0] = "A";
        names[1] = "B";
        names[2] = "C";
        names[3] = "D";
        names[4] = "E";

        // Now suppose we need to store marks of 5 students.

        int[] marks = new int[5];

        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;

        // This is a veru tedious process and an inefficient way of storing data.

        // we've to store all these values in a single variable. That's where classes and OOPS comes in.
        
        // Class is named group of properties and methods. It is a blueprint for creating objects.

        /*
        
        syntax:- class className{
             properties and methods 
         }

        */

        // This is an just an example of creating an object. We'll study more about it later.
        Student student = new Student();

        student.rNumber[0] = 1;
        student.Name[0] = "Yash";
        student.Marks[0] = 90.5f;

    }
    // creating a class (basic example)
    static class Student{
        int[] rNumber = new int[5];
        String[] Name = new String[5];
        float[] Marks = new float[5];
    }
}
