package DesignPatterns.Strategy.Payment;

public class WalletPayment implements PaymentStrategy
{
    @Override
    public void pay(double amount)
    {
        System.out.println("Paid Rs." + amount + " using Wallet.");
    }
}