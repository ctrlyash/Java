public class TypePromotion {
    public static void main(String[] args) {
        // Automatic Type promotion in expressions

        int a = 257;
        byte b = (byte)(a); 
        System.out.println(b); // 1 (257 % 256 = 1)
        // maximum value of byte is 256 so it can't hold 257 and returns the remaing value.


        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = a * b / c;

        System.out.println(d); // 20

        // Here the result of a * b is 2000 which easily exceeds maximum value of byte so it is converted to int

        byte b = 50;
        b = b * 2;
        System.out.println(b); // error
        // This cant be done as while doing b*2 it is promoted to int so it can't hold the value of byte.


        // example demonstrating type promotion rules:

        byte b = 42;
        char c = 'A';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f*b) + (i / c) - (d - s);
        // float + int - double = double
        System.out.println((f*b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);
        // O/P:-
        // 238.14 769 -1023.8766
        // 2031.0166146484376


    }
}

// Rules for type promotion:

// 1. all the byte, short and char values are converted to int

// 2. if any of the operand is long the whole operation will be converted to long

// 3. if any of the operand is float the whole operation will be converted to float

// 4. if any of the operand is double the whole operation will be converted to double