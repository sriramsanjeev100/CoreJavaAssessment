package DesignPatterns.Strategy.Payment;

public class PaymentMain
{
    public static void main(String[] args)
    {
        PaymentService payment;

        payment = new PaymentService(new CreditCardPayment());
        payment.makePayment(2500);

        payment = new PaymentService(new UPIPayment());
        payment.makePayment(1500);

        payment = new PaymentService(new NetBankingPayment());
        payment.makePayment(5000);

        payment = new PaymentService(new WalletPayment());
        payment.makePayment(750);
    }
}