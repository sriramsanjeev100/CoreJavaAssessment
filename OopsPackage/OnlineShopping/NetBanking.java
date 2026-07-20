package OopsPackage.OnlineShopping;

public class NetBanking implements Payment
{
    @Override
    public void processPayment(double amount)
    {
        if(Payment.validatePayment(amount))
        {
            System.out.println("Net Banking Payment Successful");
        }
        else
        {
            System.out.println("Invalid Amount");
        }
    }
}
