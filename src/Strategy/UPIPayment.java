package Strategy;

public class UPIPayment implements PaymentStrategy{

    public String upiID;

    public UPIPayment(String upiID)
    {
        this.upiID=upiID;
    }

    public void pay(int amount)
    {
        System.out.println("Paid amount "+amount+ " through UPI ID "+ upiID);

    }
}
