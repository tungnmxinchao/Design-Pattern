public class CartItem {
    private String name;
    private int productId;
    private double price;
    private int quantity;

    public CartItem(String name, int productId, double price, int quantity) {
        this.name = name;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return name + ": $" + price + " x " + quantity + " = $" + getTotalPrice();
    }
}
