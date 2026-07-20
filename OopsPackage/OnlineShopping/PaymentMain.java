package OopsPackage.OnlineShopping;

public class PaymentMain
{
    public static void main(String[] args)
    {
        double amount = 2500;

        if(Payment.validatePayment(amount))
        {
            Payment payment;

            payment = new CreditCard();
            payment.processPayment(amount);
            payment.printReceipt(amount);

            System.out.println();

            payment = new UPI();
            payment.processPayment(amount);
            payment.printReceipt(amount);

            System.out.println();

            payment = new NetBanking();
            payment.processPayment(amount);
            payment.printReceipt(amount);
        }
        else
        {
            System.out.println("Invalid Payment Amount");
        }
    }
}
