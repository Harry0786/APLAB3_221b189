// Define the Testable interface
interface Testable {
    void display();
}

// Create a class Test that implements Testable
class Test implements Testable {
    @Override
    public void display() {
        System.out.println("Display method in Test class");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.display();
    }
}

// Create an abstract class AbsTest that implements Testable
abstract class AbsTest implements Testable {
    // No need to implement the display method here
}