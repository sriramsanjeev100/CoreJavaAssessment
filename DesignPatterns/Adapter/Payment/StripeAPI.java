package DesignPatterns.Adapter.Payment;

public class StripeAPI
{
    public void makePayment(double amount)
    {
        System.out.println("Payment of Rs." + amount + " completed using Stripe.");
    }
}