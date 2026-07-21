package SealedClass.OnlineShopping;

public class PaypalBusinessPayment implements PayPalPayment
{
    @Override
    public void pay(double amount)
    {
        System.out.println("Paid Rs." + amount+" using PayPal Business");
    }
}
