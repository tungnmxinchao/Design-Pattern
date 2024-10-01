public class Main {
    public static void main(String[] args) {
        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
        cart.addItem(new CartItem("Apple", 1, 1.50, 4));
        cart.addItem(new CartItem("Milk", 2, 2.00, 2));

        // Select a payment method
        PaymentStrategy paypal = new PayPalStrategy("user@example.com");
        PaymentStrategy creditCard = new CreditCardStrategy("1234-5678-9012-3456");

        // Checkout using PayPal
        System.out.println("Checkout with PayPal:");
        cart.checkout(paypal);

        // Checkout using Credit Card
        System.out.println("\nCheckout with Credit Card:");
        cart.checkout(creditCard);
    }
}