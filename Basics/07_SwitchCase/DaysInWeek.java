import java.util.Scanner;
public class DaysInWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-7) to find the corresponding day of the week: ");
        int dayNum = sc.nextInt();

        // switch (dayNum) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");   
        //         break; 
        //     case 3:
        //         System.out.println("Wednesday");   
        //         break; 
        //     case 4:
        //         System.out.println("Thursday");   
        //         break; 
        //     case 5:
        //         System.out.println("Friday");   
        //         break; 
        //     case 6:
        //         System.out.println("Saturday");   
        //         break; 
        //     case 7:
        //         System.out.println("Sunday");   
        //         break; 
        
        //     default:
        //         System.out.println("Inavalid input!");
        //         break;

            /* 
            o/p:-
            Enter a number (1-7) to find the corresponding day of the week: 3
            Wednesday 
            */
        // } 
        //  Instace when we dontt provide break statement in switch case
        
        switch(dayNum) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:    
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid input!");

            /*
            o/p:-
            Enter a number (1-7) to find the corresponding day of the week: 4
            Weekday

            Enter a number (1-7) to find the corresponding day of the week: 6
            Weekend
            */    
        }
    }
}
