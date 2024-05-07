package shoppingcart;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @org.junit.jupiter.api.Test
    void subTotalTest() {
        Cart cart = new Cart();
        Product fries = new Fries("Curly Fries", Size.MEDIUM, 2.99, 100);
        Product shirt = new Shirt("T-Shirt", Size.LARGE, 19.99, 50);  // Assuming Product can be instantiated

        cart.getProducts().add(fries);
        cart.getProducts().add(shirt);
        fries.setQuantity(3);
        shirt.setQuantity(2);

        double expectedSubTotal = (2.99 * 3) + (19.99 * 2);
        double actualSubTotal = cart.subTotal();

        assertEquals(expectedSubTotal, actualSubTotal, "Subtotal calculation is incorrect.");
    }
    }

