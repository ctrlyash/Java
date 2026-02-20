import java.util.Scanner;
public class NestedSwitchCase {
    public static void main(String[] args) {
        // nested switch case is a switch case inside another switch case 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int empID = sc.nextInt();
        System.out.print("Enter department: ");
        String department = sc.next();

        switch (empID) {
            case 1:
                System.out.println("Yash Dadhich");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No such department exists!");
                        break;
                }        
                break;
            case 2:
                System.out.println("Bunny");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No such department exists!");
                        break;
                }    
                break;
            case 3:
                System.out.println("Satyarth");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No such department exists!");
                        break;                
                }
            default:
                System.out.println("No such employee exists!");                   
        }
        /*o/p:-
        Enter employee ID: 1
        Enter department: IT
        Yash Dadhich
        IT Department

        Enter employee ID: 2
        Enter department: IT
        Bunny
        IT Department
        */
    }
}
