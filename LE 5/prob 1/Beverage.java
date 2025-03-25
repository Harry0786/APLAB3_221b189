
 abstract class Beverage {
    
    private void pour(int qty) {
        System.out.println("Pour " + qty + "ml of beverage in a glass.");
    }

    protected abstract void addCondiment();

    protected void stir() {}

    protected void serve() {
        System.out.println("Serve through waiter.");
    }

    public void templateMethod(int qty) {
        pour(qty);
        addCondiment();
        stir();
        serve();
    }
}
