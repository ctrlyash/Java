public class Constructor_CallByConstructor {
    public static void main(String[] args) {
        
        Student s1 = new Student(); // creating and initializing an object s1 with the help of default constructor
        System.out.println(s1.rno + " " + s1.name + " " + s1.marks); // 13 Default Person 100.0
    }
}

class Student {
    int rno;
    String name;
    float marks;

    Student () {

        this(13, "Default Person", 100.0f);
    }

        // this is how we call a constructor from another constructor

        // internally, the default constructor is calling the parameterized constructor with some default values.
        
        // new Student() will call the default constructor which will call the parameterized constructor with the values 13, "Default Person", and 100.0f.

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    } // creating a parameterized constructor which initializes the properties of the object with the values passed as parameters.

}