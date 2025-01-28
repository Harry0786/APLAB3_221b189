package prob4;
// Class One with a parameterized constructor
class One {
    // Parameterized constructor with an integer argument
    public One(int x) {
        System.out.println("One's constructor called with x = " + x);
    }
}

// Class Two extends class One
class Two extends One {
    // Constructor for class Two
    public Two() {
        // If we don't explicitly call the parameterized constructor of One, we'll get an error
        // super(10);  // Uncomment this line to fix the error
        System.out.println("Two's constructor called");
    }
}

public class Q4 {
    public static void main(String[] args) {
        // This will cause a compile-time error because Two does not call the parameterized constructor of One
        // Two t = new Two(); // This line will not compile without the fix

        // Fix the error by uncommenting `super(10);` in the Two class constructor
        Two t = new Two();  // Now this works fine
    }
}
