import java.util.ArrayList;
import java.util.Scanner;
public class MultiArrayList {
public static void main(String[] args) {

    // creating a 2D arraylist
    // a 2D arraylist is an arraylist of arraylists
    // Syntax:
    // ArrayList<ArrayList<dataType>> arrayName = new ArrayList<>(initialCapacity);

    ArrayList<ArrayList<Integer>> list = new ArrayList<>(); // creating a 2D arraylist

    // adding elements to the 2D arraylist
    list.add(new ArrayList<>()); // adding an empty arraylist to the 2D arraylist
    list.get(0).add(1); // adding 1 to the first empty arraylist in the 2D arraylist
    list.get(0).add(2); // adding 2 to the first empty arraylist in the 2D arraylist

    list.add(new ArrayList<>()); // adding an empty arraylist to the 2D arraylist
    list.get(1).add(3); // adding 3 to the second empty arraylist in the 2D arraylist
    list.get(1).add(4); // adding 4 to the second empty arraylist in the 2D arraylist

    System.out.println(list); // Output: [[1, 2], [3, 4]]
    

    // We can also initialize the 2D arraylist using for loops.

    Scanner in = new Scanner(System.in);

    ArrayList<ArrayList<Integer>> list2 = new ArrayList<>(); // creating a 2D arraylist

    for (int i = 0; i < 2; i++) { // adding two empty arraylists to the 2D arraylist
        list2.add(new ArrayList<>());
    }

    for (int i = 0; i < 2; i++) { // adding elements to the empty arraylists in the 2D arraylist
        for (int j = 0; j < 2; j++) {
            list2.get(i).add(in.nextInt());
        }
    }
    System.out.println(list2); // Output: [[1, 2], [3, 4]]

    in.close(); 
    }
    
}
/*

Step by step explanation of the code using for loops:

// Create a Scanner object to take integer input from the user through the keyboard

// Declare a 2D ArrayList named list2
// The outer ArrayList represents rows
// Each inner ArrayList represents a row containing integers

// Loop runs 2 times to create 2 rows in the 2D ArrayList
// Each iteration adds a new empty ArrayList inside list2
// After this loop the structure becomes: [[], []]

// Nested loops are used to insert elements into the 2D ArrayList
// Outer loop controls the row index (i)
// Inner loop controls the column index (j)

// list2.get(i) accesses the inner ArrayList at row i
// add(in.nextInt()) reads an integer from the user
// and adds it to that specific row

// Print the entire 2D ArrayList
// The output will display the list in row-column form
// Example: [[1, 2], [3, 4]]

// Close the Scanner object to release system resources
*/
