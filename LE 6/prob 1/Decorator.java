public abstract class Decorator extends Offering {
    protected Offering offering;

    public Decorator(Offering offering) {
        this.offering = offering;
    }

    public abstract String getName();
    public abstract double getPrice();
}

class Coffee extends Offering {
    @Override
    public String getName() {
        return "Coffee";
    }

    @Override
    public double getPrice() {
        return 5.0;
    }
}

class Rum extends Decorator {
    public Rum(Offering offering) {
        super(offering);
    }

    @Override
    public String getName() {
        return offering.getName() + " with Rum";
    }

    @Override
    public double getPrice() {
        return offering.getPrice() + 2.0;
    }
}

abstract class Offering {
    public abstract String getName();
    public abstract double getPrice();
}