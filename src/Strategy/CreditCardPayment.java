package Strategy;

public class CreditCardPayment implements PaymentStrategy{

    private String cardNumber;

    public CreditCardPayment(String cardNumber)
    {
        this.cardNumber= cardNumber;
    }

    public void pay(int amount)
    {
        System.out.println("Paid amount "+amount+ " through credit card number "+ cardNumber);
    }
}
