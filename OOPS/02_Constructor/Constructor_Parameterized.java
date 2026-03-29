public class Constructor_Parameterized {
    public static void main(String[] args) {
        
        Student s1 = new Student(); // creating and initializing an object s1
        s1.rno = 13;    
        s1.name = "Yash";
        s1.marks = 90;

        System.out.println(s1.rno + " " + s1.name + " " + s1.marks); // 13 Yash 90

        // These properies are accessed with the help of constructor

        Student random = new Student(s1); // creating and initializing an object random with the help of constructor

        System.out.println(random.rno + " " + random.name + " " + random.marks); // 13 Yash 90

        // Here we are creating a new object random and initializing it with the properties of the object s1 using the parameterized constructor. So, the properties of the object random will be same as the properties of the object s1.
    }
}

class Student {

    int rno;
    String name;
    float marks;


       
    Student() {
        this.rno = 13;
        this.name = "Yash";
        this.marks = 90;
    } // creating a default constructor which initializes the properties of the object with some default values.



    Student (Student other) {
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    // Above is a parameterized constructor which takes an object of the same class as a parameter and initializes the properties of the current object with the properties of the passed object.

}
