package behavioralpatterns.strategy_2;

public class PayPal implements Payment {
    private String emailId;
    private String password;

    public PayPal(String email, String pwd) {
        this.emailId = email;
        this.password = pwd;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid using PayPal.");
    }
}
