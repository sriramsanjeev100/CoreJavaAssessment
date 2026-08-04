package DesignPatterns.Adapter.Payment;

public class Checkout
{
    private PaymentService paymentService;

    public Checkout(PaymentService paymentService)
    {
        this.paymentService = paymentService;
    }

    public void checkout(double amount)
    {
        paymentService.pay(amount);
    }
}