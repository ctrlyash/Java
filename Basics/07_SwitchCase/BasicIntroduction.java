import java.util.Scanner;

public class BasicIntroduction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter fruit name: ");
        String fruit = in.next();

        if (fruit.equalsIgnoreCase("mango")) {
            System.out.println("King of fruits");
        }
        if (fruit.equalsIgnoreCase("apple")) {
            System.out.println("A sweet red fruit");
        }
        if (fruit.equalsIgnoreCase("banana")) {
            System.out.println("A rich souce of energy");
        }

        // As we can see using multiple if statements when multiples conditions are there is repetetive.

        // Therefore we use SwtichCases
        // Syntax:
        /*
         swtich (expression) {
            case one:
                do something
                break;
            case two:
                do something
                break;
            default:
                do something        
         }
        */
        
        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break; // if break is not provided, then all executions below it will execute untill next break.
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Banana":
                System.out.println("A rich souce of energy");
                break;
            case "Grapes":
                System.out.println("It is a small fruit");
            default: // it is used when none of the case mathes the input
                System.out.println("Please enter a valid fruit!");   
                
            // o/p:-
            // Enter fruit name: Mango
            // King of fruits    
        }
        /*
         Rules:
         - cases should be of same type of expression
         - duplicate case values are not allowed
         - if default is not at the end we've to put break after it.
        */ 
    }
}




