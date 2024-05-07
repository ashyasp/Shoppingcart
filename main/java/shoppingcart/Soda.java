package shoppingcart;

public class Soda extends Food {
    private static int inventory ;

    public Soda(String name, Size size, double price, int inventory) {
        super(name, size, price, inventory);
    }

    @Override
    public boolean isPerishable() {
        return false;
    }
}
