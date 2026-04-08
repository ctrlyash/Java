// Outer class cannot be static but inner class can be static because it is not associated with an instance of the outer class. 
// A static inner class can be instantiated without creating an instance of the outer class, and it can access static members of the outer class directly. 
// This allows for better organization and encapsulation of related classes within a single outer class, while still providing the flexibility to use the inner class independently when needed.

public class StInnerClass {
    static class Test{
        String name;
        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("John");
        Test b = new Test("Jane");

        System.out.println(a.name); // John 
        System.out.println(b.name); // Jane

        // the ouputs are ddifferent and not same because we are creating two different objects of the static inner class Test and each object has its own copy of the name variable. Therefore, when we assign "John" to a.name and "Jane" to b.name, they are stored in separate memory locations, resulting in different outputs when we print them.
    }
}
