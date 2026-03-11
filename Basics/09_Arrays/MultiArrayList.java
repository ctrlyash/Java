import java.util.ArrayList;
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
    
    }
    
}
/*
Explanation:

The above code creates a 2D arraylist called list. It then adds two empty arraylists to the 2D arraylist, and then adds elements to the empty arraylists. Finally, it prints the 2D arraylist. 
*/
