public class Singleton {

    private Singleton() {
        // Private constructor to prevent instantiation from outside the class
    }

    private static Singleton instance; // Static variable to hold the single instance of the class

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
