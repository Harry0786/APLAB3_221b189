// Parent class Animal
abstract class Animal {
    abstract void makeVoice();
}

// Subclasses representing different animals
class Cow extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Cow says: Moo!");
    }
}

class Dog extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Dog says: Woof!");
    }
}

class Pig extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Pig says: Oink!");
    }
}

class Goat extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Goat says: Baa!");
    }
}

class Lion extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Lion says: Roar!");
    }
}

// Voice class
class Voice {
    private Animal[] animals = new Animal[5];

    // Method to initialize the array with animal objects
    void prepareVoice() {
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    // Method to loop through and invoke makeVoice() for all animals
    void hear() {
        for (Animal animal : animals) {
            animal.makeVoice(); // Polymorphic behavior
        }
    }
}

// Test class with main method
public class Q1 {
    public static void main(String[] args) {
        Voice voice = new Voice();
        voice.prepareVoice(); // Prepare animals
        voice.hear(); // Hear their voices
    }
}
