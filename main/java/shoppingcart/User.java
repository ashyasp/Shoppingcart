package shoppingcart;

public class User {
    final int id;
    Cart cart;

    public User(int id) {
        this.id = id;
        this.cart =new Cart();
    }


    // Adds a product with a specified quantity to the cart
    public void addToCart(Product product, int quantity) {
        if (product.getInventory() >= quantity) {
            product.setInventory(product.getInventory() - quantity); // Decrease inventory
            // Check if the product already exists in the cart
            boolean found = false;
            for (Product p : cart.getProducts()) {
                if (p.getName().equals(product.getName())) {
                    p.setQuantity(p.getQuantity() + quantity); // Increase quantity if already in cart
                    found = true;
                    break;
                }
            }
            if (!found) {
                product.setQuantity(quantity); // Set the product quantity
                cart.getProducts().add(product); // Add product to the cart if not found
            }
        } else {
            System.out.println("Product out of stock");
        }
    }

    // Removes a specified quantity of a product from the cart
    public void removeFromCart(Product product, int quantity) {
        boolean found = false;
        for (Product p : cart.getProducts()) {
            if (p.getName().equals(product.getName()) && p.getQuantity() >= quantity) {
                p.setQuantity(p.getQuantity() - quantity); // Decrease the quantity
                if (p.getQuantity() == 0) {
                    cart.getProducts().remove(p); // Remove the product if the quantity is zero
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Trying to remove more items than are in the cart or item not found");
        }
    }
}