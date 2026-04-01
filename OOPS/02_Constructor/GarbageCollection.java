public class GarbageCollection {
    public static void main(String[] args) {

        // Array to store object references temporarily
        HeavyObject[] objects = new HeavyObject[10000];

        // Creating large number of objects to simulate heavy memory load
        for (int i = 0; i < objects.length; i++) {

            // Creating new object
            objects[i] = new HeavyObject(i);

            // When index reaches a certain point, remove reference
            // This makes earlier objects eligible for Garbage Collection
            if (i % 100 == 0) {
                // Removing reference to previous object
                objects[i / 2] = null;
            }
        }

        // Suggest JVM to run Garbage Collector
        System.out.println("\nRequesting Garbage Collection...");
        System.gc();

        // Creating memory pressure by allocating large arrays
        try {
            for (int i = 0; i < 50; i++) {
                // Allocate large memory blocks
                byte[] memoryFill = new byte[1024 * 1024]; // 1 MB
                // Use the array so the local variable is not considered unused
                memoryFill[0] = 1;
                System.out.println("Allocated memory block " + (i + 1) + ", first byte: " + memoryFill[0]);
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Memory is full, Garbage Collector triggered!");
        }

        System.out.println("\nEnd of program");
    }
}

// Class to demonstrate object creation and destruction
class HeavyObject {
    int id;

    // Constructor to initialize object
    HeavyObject(int id) {
        this.id = id;
        System.out.println("Object Created with ID: " + id);
    }

    // finalize() is called by Garbage Collector before destroying object
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed with ID: " + id);
    }
}

/*
Step by step explanation: 

Java stores objects in memory (heap area).
When we create an object using new, memory is allocated.

Example:

objects[i] = new HeavyObject(i);

→ Object is created and stored in array.

Large number of objects (like 10,000) increases memory usage.

When we remove reference:

objects[i / 2] = null;

→ Object is no longer accessible.

Object with no reference becomes eligible for Garbage Collection.
Garbage Collector (GC) is a part of JVM.
GC automatically removes unused objects from memory.

We can request GC using:

System.gc();

→ But it is not guaranteed.

Creating large memory blocks:

byte[] memoryFill = new byte[1024 * 1024];

→ Increases memory pressure.

When memory becomes low, JVM runs Garbage Collector automatically.
GC deletes unused objects and frees memory.
If memory is still insufficient:
→ OutOfMemoryError occurs.
Garbage Collection improves memory efficiency.
Important condition:
→ Object is deleted only when no references exist.
*/