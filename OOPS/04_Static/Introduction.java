public class Introduction {
    public static void main(String[] args) {

        // Static variables and methods belong to the class rather than instances
        // They can be accessed without creating an object of the class

        Human.message(); // Hello world
        // we can call static method without creating an object of the class

        // Creating multiple Human objects to demonstrate static variable population

        Human Yash = new Human(22, "Yash", 10000, false);
        Human rahul = new Human(34, "Rahul", 15000, true);
        Human arpit = new Human(34, "arpit", 15000, true);

        System.out.println(Human.population); // 3 
        System.out.println(Human.population); // 3
        System.out.println(Human.population); // 3

        // we saw that population is 3 for all the objects because it is a static variable and it belongs to the class not to the object

      

    }
}

 class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message() {
        System.out.println("Hello world");
        //        System.out.println(this.age); // cant use this over here
    }

    // Constructor to initialize object and increment population
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1; // Increment population whenever a new Human object is created
    }
}