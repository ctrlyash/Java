public class Constructor_basics {

    // Constructor is a special method that is called when an object is created. It is used to initialize the object's state.

    // It contains the same name as the class, and it is called when an object is created.

    // Need for constructor: To initialize the object's state. i.e in simple words to set the initial values of the object's properties.
    public static void main(String[] args) {

        Student s1 = new Student(); // creating and initializing an object s1
        s1.rno = 13;    
        s1.name = "Yash";
        s1.marks = 90;

        System.out.println(s1.rno + " " + s1.name + " " + s1.marks); // 13 Yash 90

        // These properies are accessed with the help of constructor

        // Similarly we can do this with functions.

        s1.greeting(); // Hello! my name is  Yash

        s1.changeName("Stu"); // chnaging the name
        s1.greeting(); // Hello! my name is  Stu
    }

}

// creating a class
// for every single student we need to store roll number, name and marks
class Student {

    int rno;
    String name;
    float marks;

    // We need a way to add the values of the above properties object by object

    // we need one word to access every object and that word is this keyword

    // Here this keyword refers to the current object( it will get replaced by the object name while accessing properties for that particular object.)

    void greeting() {
        System.out.println("Hello! my name is  " + this.name);
    } // creating a function for greeting

    // creating a function for changing name
    void changeName(String newName) {
        this.name = newName;
    }
    

    Student() {
        this.rno = 13;
        this.name = "Yash";
        this.marks = 90;
    }

}
