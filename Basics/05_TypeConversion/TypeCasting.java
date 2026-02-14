import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);
        // 10
        // 10.0

        int num1 = (int)(12.87f); // explicit casting
        System.out.println(num1); //12

        int num2 = 'A';
        System.out.println(num2); // 65
        // 65 is the ASCII value of A in the character set of the computer
        // This is an example of implicit type casting

    }
}

// Notes:-

// Type casting is a process of converting one data type to another

// Implicit Type Casting
// Java automatically does type casting when we assign a value of one type to a variable of another type
// It is ony possible when:
// the two types should be compatible
// the destination type should be grater than the source type
// order of the types:
// byte -> short -> int -> long -> float -> double -> char 


// Explicit Type Casting
// it is done when we want to convert grater type to smaller type
// for eg: float to int
// int num1 = (int)(12.87f);
