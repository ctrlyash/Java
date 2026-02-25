public class Scopes {
    public static void main(String[] args) {
        // Method Scope: The region inside a method where a variable is declared and can be accessed. Variables defined within a method are local to that method and cannot be used outside it.

        // For eg:

        System.out.println(a); // This gives an error because a is initiased in a method and it cannod be accessed directly in another method.

        // Block Scope: The region inside a block of code (like loops, if statements, etc.) where a variable is declared and can be accessed. Variables defined within a block are local to that block and cannot be used outside it.
        // It is usually denoted by curly braces {}.

        // For eg:

        {
            int x = 5; // This variable 'x' is only accessible within this block.
        }
        System.out.println(x); // This gives an error because x is initiased in a block and it cannod be accessed directly in another block.

        // However, if we initialise a variable outside the block, it can be accessed within the block:
        int y = 10;
        {
            System.out.println(y); // This works because 'y' is accessible within the block.
        }

        // Block scope is also applicable in loops and if statements:
        for (int i = 0; i < 5; i++) {
            System.out.println(i); // 'i' is only accessible within this loop.
        }
    }

    static void random (int a, int b) {
        a = 3;
        b = 6;
    }
}
