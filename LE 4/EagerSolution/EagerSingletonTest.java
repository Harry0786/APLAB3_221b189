public class EagerSingletonTest {
    public static void main(String[] args) {
        // Eager Initialization Singleton
        EagerSingleton.getInstance();
        EagerSingleton.getInstance();
        System.out.println("Eager Singleton Instances Created: " + EagerSingleton.getCounter());
    }
}

// Eager Initialization Singleton
class EagerSingleton {
    // Instance is created at the time of class loading
    private static final EagerSingleton instance = new EagerSingleton();
    private static int counter = 1;

    // Private constructor to prevent instantiation
    private EagerSingleton() {
        if (counter > 1) {
            throw new IllegalStateException("Singleton instance already created!");
        }
        counter++;  // Increment counter when the instance is created
    }

    // Public method to provide access to the instance
    public static EagerSingleton getInstance() {
        return instance;
    }

    // Counter method to track the number of instances requested
    public static int getCounter() {
        return counter;
    }
}

