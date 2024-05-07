package shoppingcart;

public class Fries extends Food {
    private static int inventory;

    public Fries(String name, Size size, double price, int inventory) {
        super(name, size, price, inventory);
    }

    @Override
    public boolean isPerishable() {
        return false;
    }
}
