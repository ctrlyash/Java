public class InstanceOfOperator {

        /*
        The instanceof operator is used to test whether an object is an instance of a specific class or implements a specific interface. It returns true if the object is an instance of the specified type, and false otherwise. The syntax is:
    
        object instanceof Type
        */
    public static void main(String[] args) {

        String name = "Yash";

        boolean check = name instanceof String;

        System.out.println("Is name a String? " + check);
    }
}
/*
O/P:-
Is name a String? true
*/
