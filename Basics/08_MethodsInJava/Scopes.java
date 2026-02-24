public class Scopes {
    public static void main(String[] args) {
        // Method Scope: The region inside a method where a variable is declared and can be accessed. Variables defined within a method are local to that method and cannot be used outside it.

        // For eg:

        System.out.println(a); // This gives an error because a is initiased in a method and it cannod be accessed directly in another method.
    }

    static void random (int a, int b) {
        a = 3;
        b = 6;
    }
}
