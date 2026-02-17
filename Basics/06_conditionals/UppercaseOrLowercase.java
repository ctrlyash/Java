import java.util.Scanner;
public class UppercaseOrLowercase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a chracter: ");

        char alphabet = input.next().trim().charAt(0); 
        // trim() method is used to remove extra spaces from the string
        // charAt(0) method is used to get the first character of the string

        if (alphabet >= 'A' && alphabet <= 'Z') {
            System.out.println(alphabet + " is an uppercase letter.");
        } 
        else if (alphabet >= 'a' && alphabet <= 'z') {
            System.out.println(alphabet + " is a lowercase letter.");
        }
        else {
            System.out.println(alphabet + " is not a letter.");
        }
        /*
        O/P:-
        Enter a chracter: 
        J
        J is an uppercase letter.
        */
    }
}
