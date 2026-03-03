import java.util.Scanner;

public class BitwiseOperators {

    // Bitwise operators perform operations on individual bits of the operands. They are used for low-level programming, such as manipulating data at the bit level, and can be more efficient than arithmetic operations in certain cases.

    /*  The main bitwise operators in Java are:

    1. Bitwise AND (&): This operator returns 1 only if both corresponding bits of the operands are 1, otherwise it returns 0.

    2. Bitwise OR (|): This operator returns 1 if at least one of the corresponding bits of the operands is 1, otherwise it returns 0.

    3. Bitwise XOR (^): This operator returns 1 only if the corresponding bits of the operands are different, otherwise it returns 0.

    4. Left Shift (<<): This operator shifts the bits of the first operand to the left by the number of positions specified by the second operand. The vacated bits on the right are filled with 0s.

    5. Right Shift (>>): This operator shifts the bits of the first operand to the right by the number of positions specified by the second operand. The vacated bits on the left are filled with 0s.
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("num1: ");
        int num1 = input.nextInt();
        System.out.println("num2: ");
        int num2 = input.nextInt();

        int andOp = num1 & num2;
        int orOp = num1 | num2;
        int xorOp = num1 ^ num2;
        int leftShift = num1 << 1;
        int rightShift = num1 >> 1;

        System.out.println("Bitwise AND: " + andOp); // 1 only if both bits are 1, otherwise 0

        System.out.println("Bitwise OR: " + orOp); // 1 if at least one of the bits is 1, otherwise 0

        System.out.println("Bitwise XOR: " + xorOp); // 1 only if bits are different, otherwise 0

        System.out.println("Left Shift: " + leftShift); // Shifts bits to the left, filling with 0s on the right. Equivalent to multiplying by 2 for each shift.

        System.out.println("Right Shift: " + rightShift); // Shifts bits to the right. For positive numbers, fills with 0s on the left. For negative numbers, fills with 1s on the left. Equivalent to dividing by 2 for each shift (for positive numbers).

        // Example of left shift:
        // If num1 is 5 (binary 0000 0101), left shifting by 1 will give 10 (binary 0000 1010).
        // Example of right shift:
        // If num1 is 5 (binary 0000 0101), right shifting by 1 will give 2 (binary 0000 0010).
        // If num1 is -5 (binary 1111 1011 in two's complement), right shifting by 1 will give -3 (binary 1111 1101 in two's complement).
    }
}
/*
O/P:-
num1:
5 (binary 0000 0101)
num2:
2 (binary 0000 0010)
Bitwise AND: 0 (as 0000 0101 & 0000 0010 = 0000 0000)
Bitwise OR: 7 (as 0000 0101 | 0000 0010 = 0000 0111)
Bitwise XOR: 7 (as 0000 0101 ^ 0000 0010 = 0000 0111)
Left Shift: 10 (as 0000 0101 << 1 = 0000 1010)
Right Shift: 2 (as 0000 0101 >> 1 = 0000 0010)
*/
