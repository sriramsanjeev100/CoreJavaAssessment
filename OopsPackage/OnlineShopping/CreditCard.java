package OopsPackage.OnlineShopping;

public class CreditCard implements Payment
{
    @Override
    public void processPayment(double amount)
    {
        if (Payment.validatePayment(amount))
        {
            System.out.println("Credit Card Payment Successful0");
        }
        else
        {
            System.out.println("Invalid Amount");
        }
    }
}
