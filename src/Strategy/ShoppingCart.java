package Strategy;

public class ShoppingCart {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy=paymentStrategy;
    }

    public void checkout(int amount)
    {
        if(paymentStrategy==null)
        {
            System.out.println("Please choose the payment strategy");
        }
        else {
            paymentStrategy.pay(amount);
        }
    }
}
