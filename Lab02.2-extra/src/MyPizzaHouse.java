public class MyPizzaHouse {
    public void makePizza() {
        prepare();
        addToppings();
        bake();
    }

    private void prepare() {
        System.out.println("Preparing pizza...");
    }

    private void addToppings() {
        System.out.println("Adding toppings...");
    }

    private void bake() {
        System.out.println("Baking pizza...");
    }
}
