public class WrapperImmutability {
     public static void main(String[] args) {

        Integer x = 20;

        System.out.println("Before method call: " + x); // 20

        modify(x);

        //  Still same value
        System.out.println("After method call: " + x); // 20

        
    }

    // Method trying to modify Integer
    static void modify(Integer num) {

        System.out.println("Before modification inside method: " + num); // 20

        //  This does NOT modify original object
        num = num + 10;

        /*
         What actually happens here:
         1. num is unboxed → int value
         2. 10 is added
         3. New Integer object is created
         4. num now points to NEW object

         Original object is untouched
        */

        System.out.println("After modification inside method: " + num); // 30 (num now points to new Integer object with value 30)
    }

}

// This demonstrates that Integer objects are immutable. When we try to modify the Integer inside the method, it does not change the original Integer object. Instead, it creates a new Integer object with the modified value, leaving the original object unchanged.
