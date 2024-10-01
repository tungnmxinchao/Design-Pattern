import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(CartItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(CartItem::getTotalPrice).sum();
    }

    public void checkout(PaymentStrategy paymentStrategy) {
        double total = calculateTotal();
        System.out.println("Items in cart:");
        items.forEach(System.out::println);
        System.out.println("Total: $" + total);
        paymentStrategy.pay((int) total);
    }
}
