import java.util.ArrayList;
import java.util.Arrays;
public class Arrays_nwArrayList {
    public static void main(String[] args) {
        
        // why do we need arraylist?
        // we need an arraylist when we want to store and manipulate a collection of objects in a dynamic way, which means that the size of the collection can change over time.

        // Syntax:
        // ArrayList<dataType> arrayName = new ArrayList<>(InitialCapacity);

        // for example:
        ArrayList<String> names = new ArrayList<>();
        names.add("Yash");
        names.add("Dadhich");
        System.out.println(names); // Output: [Yash, Dadhich]

        // we can also use the get method to access the elements of the arraylist in case you want to access a specific element like this:
        System.out.println(names.get(0)); // Output: Yash

        // Another example with integers:
        ArrayList<Integer> numbers = new ArrayList<>(); // here Integer is the data type of the arraylist and it is the wrapper class or the primitive data type 
        // (Wrapper classes are classes that represent primitive data types in java. For example, int is a primitive data type, but Integer is a wrapper class that represents int.)
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers); // Output: [1, 2, 3]

        // Other methods of arraylist:

        // add() method: adds an element to the end of the arraylist

        // addAll() method: adds all the elements of another arraylist to the current arraylist

        // remove() method: removes an element from the arraylist

        // get() method: returns the element at the specified index

        // size() method: returns the number of elements in the arraylist

        // clear() method: removes all elements from the arraylist

        // contains() method: returns true if the arraylist contains the specified element

        // isEmpty() method: returns true if the arraylist is empty

        // toArray() method: returns an array of the elements in the arraylist

        // subList().clear() method: removes a range of elements from the arraylist

        // set() method: sets the element at the specified index

        // indexOf() method: returns the index of the first occurrence of the specified element

        // lastIndexOf() method: returns the index of the last occurrence of the specified element

        // and more.....
        

        // Now an example demonstrating these methods:
        ArrayList<String> fruits = new ArrayList<>(); // creating an arraylist of strings
        fruits.add("apple"); // adding an element to the arraylist
        fruits.add("banana");
        fruits.add("orange");
        System.out.println(fruits); // Output: [apple, banana, orange]


        fruits.remove(1); // removing an element from the arraylist
        System.out.println(fruits); // Output: [apple, orange]


        System.out.println(fruits.get(0)); // Output: apple


        System.out.println(fruits.size()); // Output: 2


        fruits.clear(); // removing all elements from the arraylist
        System.out.println(fruits); // Output: []


        System.out.println(fruits.contains("apple")); // Output: false


        System.out.println(fruits.isEmpty()); // Output: true


        String[] fruitsArray = fruits.toArray(new String[0]); // converting the arraylist to an array
        System.out.println(Arrays.toString(fruitsArray)); // Output: []


        // another example

        ArrayList<Integer> numbers2 = new ArrayList<>(); // creating an arraylist of integers

        numbers2.add(1); // adding an element to the arraylist
        numbers2.add(2);
        numbers2.add(3);
        System.out.println(numbers2); // Output: [1, 2, 3]


        numbers2.addAll(numbers); // adding all the elements of another arraylist to the current arraylist
        System.out.println(numbers2); // Output: [1, 2, 3, 1, 2, 3]

        
        numbers2.subList(2, 4).clear();; // removing a range of elements from the arraylist
        System.out.println(numbers2); // Output: [1, 2, 3]


        numbers2.set(0, 10); // setting the element at the specified index
        System.out.println(numbers2); // Output: [10, 2, 3]


        System.out.println(numbers2.indexOf(2)); // Output: 1
        System.out.println(numbers2.lastIndexOf(2)); // Output: 1

    }
}
/*
Internal working of ArrayList:

- Initial size of arraylist is fixed internally.
- When the arraylist is full, a new arraylist is created with double the size of the previous arraylist.
- The old arraylist is deleted and the new arraylist is made the head of the linked list.


Topic not to consider for now:

Anotised Time Complexity:
- Adding an element to the arraylist: O(1)
- Removing an element from the arraylist: O(n)
- Accessing an element in the arraylist: O(1)
- Inserting an element in the arraylist: O(n)
- Removing a range of elements from the arraylist: O(n)
means that the time complexity of these operations is linear in the size of the arraylist. 
*/

