package OopsPackage.OnlineShopping;

public interface Payment
{
    void processPayment(double amount);

    default void printReceipt(double amount)
    {
        System.out.println("=====Receipt=====");
        System.out.println("Amount Paid : Rs."+ amount);
        System.out.println("Payment Successful");
    }

    static boolean validatePayment(double amount)
    {
        return amount > 0;
    }
}

