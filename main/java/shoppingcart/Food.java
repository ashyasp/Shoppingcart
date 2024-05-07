package shoppingcart;

public abstract class Food extends Product implements Perishable
{
    private static int inventory ;

    public Food(String name, Size size, double price, int inventory) {
        super(name, size, price, inventory);
    }
}
