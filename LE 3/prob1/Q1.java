// Interface representing obedience
interface Obedient {
    void obey();
}

// Interface representing kindness
interface Kind {
    void kind();
}

// Interface representing disobedience
interface Disobedient {
    void disobey();
}

// Interface representing cruelty
interface Cruel {
    void cruel();
}

// Abstract class representing a Bharatvanshi
abstract class Bharatvanshi {
    // All Bharatvanshis are fighters
    abstract void fight();
}

// Abstract class representing a Pandav
abstract class Pandav extends Bharatvanshi implements Obedient, Kind {
    @Override
    public void obey() {
        System.out.println("Obeying");
    }

    @Override
    public void kind() {
        System.out.println("Being kind");
    }
}

// Concrete class representing Arjun
class Arjun extends Pandav {
    @Override
    void fight() {
        System.out.println("Arjun is fighting");
    }
}

// Concrete class representing Bheem
class Bheem extends Pandav {
    @Override
    void fight() {
        System.out.println("Bheem is fighting");
    }

    @Override
    public void kind() {
        System.out.println("Being less kind");
    }
}

// Abstract class representing a Kaurav
abstract class Kaurav extends Bharatvanshi implements Disobedient, Cruel {
    @Override
    public void disobey() {
        System.out.println("Disobeying");
    }

    @Override
    public void cruel() {
        System.out.println("Being cruel");
    }
}

// Concrete class representing Duryodhan
class Duryodhan extends Kaurav {
    @Override
    void fight() {
        System.out.println("Duryodhan is fighting");
    }
}

// Concrete class representing Vikarn
class Vikarn extends Kaurav implements Obedient, Kind {
    @Override
    void fight() {
        System.out.println("Vikarn is fighting");
    }

    @Override
    public void obey() {
        System.out.println("Obeying");
    }

    @Override
    public void kind() {
        System.out.println("Being kind");
    }
}

// Main class to test the implementation
public class Q1 {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();

        arjun.fight();
        arjun.obey();
        arjun.kind();

        bheem.fight();
        bheem.obey();
        bheem.kind();

        duryodhan.fight();
        duryodhan.disobey();
        duryodhan.cruel();

        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}