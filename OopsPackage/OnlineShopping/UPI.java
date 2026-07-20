package OopsPackage.OnlineShopping;

public class UPI implements Payment
{
    @Override
    public void processPayment(double amount)
    {
        if(Payment.validatePayment(amount))
        {
            System.out.println("UPI Payment Successful");
        }
        else
        {
            System.out.println("Invalid Amount");
        }
    }
}
