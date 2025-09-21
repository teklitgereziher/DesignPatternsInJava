package behavioralpatterns.strategy_2;

public class CryptoPayment implements Payment {
    private String walletAddress;

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Cryptocurrency wallet: " + walletAddress);
    }
}
