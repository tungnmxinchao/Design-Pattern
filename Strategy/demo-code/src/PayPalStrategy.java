public class PayPalStrategy  implements PaymentStrategy{
    private String email;

    public PayPalStrategy(String email) {
        this.email = email;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal with email: " + email);
    }
}
