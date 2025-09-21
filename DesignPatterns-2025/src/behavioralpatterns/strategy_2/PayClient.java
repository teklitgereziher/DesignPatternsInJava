package behavioralpatterns.strategy_2;

public class PayClient {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        System.out.println("Credit Card Payment:");
        paymentContext.setPaymentStrategy(new CreditCard("John", "1234-5678-9876-5432", "2346", "12-2025"));
        paymentContext.pay(150.75);

        System.out.println("\nPayPal Payment:");
        paymentContext.setPaymentStrategy(new PayPal("user@example.com", "psw"));
        paymentContext.pay(200.00);

        System.out.println("\nCryptocurrency Payment:");
        paymentContext.setPaymentStrategy(new CryptoPayment("wallet123xyz"));
        paymentContext.pay(350.00);
    }
}
