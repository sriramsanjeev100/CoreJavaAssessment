package DesignPatterns.Strategy.Payment;

public class NetBankingPayment implements PaymentStrategy
{
    @Override
    public void pay(double amount)
    {
        System.out.println("Paid Rs." + amount + " using Net Banking.");
    }
}