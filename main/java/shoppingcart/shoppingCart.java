package shoppingcart;

public class shoppingCart {
    public static void main(String[] args) {
        // Create a cart and products
        User user = new User(1);
        Product fries = new Fries("Curly Fries", Size.MEDIUM, 2.99, 100);
        Product shirt = new Shirt("T-Shirt", Size.LARGE, 19.99, 50);

        // Add products to the cart
        user.addToCart(fries, 3);
        user.addToCart(shirt, 2);

        // Display the cart contents and subtotal
        displayCartContents(user.cart);
        System.out.println("Subtotal: $" + user.cart.subTotal());
        System.out.println("Total after tax: $" + user.cart.totalAfterTax());

        // Remove an item and display the updated cart
        user.removeFromCart(fries, 1);
        displayCartContents(user.cart);
        System.out.println("Updated subtotal after removing some fries: $" + user.cart.subTotal());

        // Checkout
        user.cart.checkOut();
    }

    private static void displayCartContents(Cart cart) {
        if (cart.getProducts().isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            for (Product product : cart.getProducts()) {
                System.out.println(product.getName() + " x " + product.getQuantity() + " = $" + (product.getPrice() * product.getQuantity()));
            }
        }
    }
}
