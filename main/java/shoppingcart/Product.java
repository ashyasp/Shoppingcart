package shoppingcart;

public abstract  class Product {
    private int  ID = 0;
    private static int sharedID;
    private String name;
    private Size size;
    private double price;
    private int inventory;
    private int quantity=0;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public Product (String name, Size size, double price, int inventory) {
this.inventory=inventory;
this.name=name;
this.size=size;
this.price=price;
this.ID=sharedID++;



    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
