// this is a demo to show initialisation of static variables in java
public class Static_Initialisation {
    static int a = 10; // Static variable initialized at declaration    
    static int b = 20;

    // will only run once, when the first object is created or when the class is loaded, whichever comes first
    static {
        System.out.println("I am in static");
        b = a * 5; // Static block can modify static variables
    }

    public static void main(String[] args) {
       Static_Initialisation obj = new Static_Initialisation();
       System.out.println(Static_Initialisation.a + " " + Static_Initialisation.b); // Output: 10 50

       Static_Initialisation.b += 3; // Modifying static variable b
       System.out.println(Static_Initialisation.a + " " + Static_Initialisation.b); // Output: 10 53
    }

}
