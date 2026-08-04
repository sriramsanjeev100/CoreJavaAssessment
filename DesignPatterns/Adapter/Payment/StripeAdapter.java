package DesignPatterns.Adapter.Payment;

public class StripeAdapter implements PaymentService
{
    private StripeAPI stripeAPI;
    public StripeAdapter()
    {
        stripeAPI = new StripeAPI();
    }

    @Override
    public void pay(double amount)
    {
        stripeAPI.makePayment(amount);
    }
}