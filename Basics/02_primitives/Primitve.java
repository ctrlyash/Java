public class Primitve {
    public static void main(String[] args) {
        int rollno = 10; // 10 is a literal, rollno is a variable or identifier
        char letter = 'Y';
        float marks = 90.5f;
        double largeDecimalNumbers = 4567654.8746;
        long largeInteger = 9876543210L;
        boolean checkTrueorFalse = true;

        System.out.println(rollno);
        System.out.println(letter);
        System.out.println(marks);
        System.out.println(largeDecimalNumbers);
        System.out.println(largeInteger);
        System.out.println(checkTrueorFalse);

        int a = 234_000_000;
        System.out.println(a);
        // 234000000
        // _ separates the digits of the number and makes it easier to read


    }
}

// All decimal values are by default in double. We've to add f at the end to make it a float

// Simillarly all integer values are by default in int. We've to add L at the end to make it a long
