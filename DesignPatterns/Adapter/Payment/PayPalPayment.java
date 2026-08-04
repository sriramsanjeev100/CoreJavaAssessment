package DesignPatterns.Adapter.Payment;

public class PayPalPayment implements PaymentService
{
    @Override
    public void pay(double amount)
    {
        System.out.println("Payment of Rs." + amount + " completed using PayPal.");
    }
}