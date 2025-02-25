// Lazy Initialization Singleton
class LazySingleton {
    // Instance is created only when it is requested for the first time
    private static LazySingleton instance;
    private static int counter = 0;

    // Private constructor to prevent instantiation
    private LazySingleton() {
        if (counter > 0) {
            throw new IllegalStateException("Singleton instance already created!");
        }
        counter++;  // Increment counter when the instance is created
    }

    // Public method to provide access to the instance, using double-checked locking to make it thread-safe
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    // Counter method to track the number of instances requested
    public static int getCounter() {
        return counter;
    }
}
