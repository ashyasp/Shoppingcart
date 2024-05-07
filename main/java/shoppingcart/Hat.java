package shoppingcart;

public class Hat extends Clothing {
    private static int inventory;
    public Hat(String name, Size size, double price, int inventory) {
        super(name, size, price, inventory);
    }
}
