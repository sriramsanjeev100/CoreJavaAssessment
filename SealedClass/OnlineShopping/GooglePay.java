package SealedClass.OnlineShopping;

public final class GooglePay implements UPIPayment
{
    @Override
    public void pay(double amount)
    {
        System.out.println("Paid Rs." + amount + " using Google Pay");
    }
}
