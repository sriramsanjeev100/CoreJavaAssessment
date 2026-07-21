package SealedClass.OnlineShopping;

public class PaypalPersonalPayment implements PayPalPayment
{
    @Override
    public void pay(double amount)
    {
        System.out.println("Paid Rs." + amount+" using Personal PayPal");
    }
}
