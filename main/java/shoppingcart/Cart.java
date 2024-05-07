package shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
private ArrayList<Product> products;
private final float TAX =0.15f;
private Special special;
public Cart (){
    this.products=new ArrayList<>();
}
public List<Product> getProducts(){
    return products;
}



public double subTotal() {
    double subtotal = 0;
    for (Product product : products) {
        subtotal += product.getPrice() * product.getQuantity();
    }
    return subtotal;
        }

        public double totalAfterTax() {
            double subtotal = subTotal();
            return subtotal * (1 + TAX);
        }

        public void checkOut() {
            double total = totalAfterTax();
            System.out.println("Total amount due after tax: $" + String.format("%.2f", total));
            products.clear();
            System.out.println("Thank you for your purchase!");
        }



        public int cartQty() {
            int totalQuantity = 0;
            for (Product product : products) {
                totalQuantity += product.getQuantity();
            }
            return totalQuantity;
        }






}
