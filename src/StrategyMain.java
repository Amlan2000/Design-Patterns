import Strategy.CreditCardPayment;
import Strategy.ShoppingCart;
import Strategy.UPIPayment;

public class StrategyMain {

    public static void main(String [] args)
    {
        System.out.printf("Hello and welcome to Strategy Main!\n");

        ShoppingCart cart = new ShoppingCart();

        CreditCardPayment card1= new CreditCardPayment("12345678");

        cart.setPaymentStrategy(card1);
        cart.checkout(700);

        UPIPayment upi = new UPIPayment("98765432");

        cart.setPaymentStrategy(upi);
        cart.checkout(500);



    }
}
