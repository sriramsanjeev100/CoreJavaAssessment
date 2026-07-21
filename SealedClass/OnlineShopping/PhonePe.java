package SealedClass.OnlineShopping;

public final class PhonePe implements UPIPayment
{
    @Override
    public void pay(double amount)
    {
        System.out.println("Paid Rs." + amount+" using PhonePe");
    }
}
