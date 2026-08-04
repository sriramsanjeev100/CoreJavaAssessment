package DesignPatterns.Adapter.Payment;

public class PaymentMain
{
    public static void main(String[] args)
    {
        System.out.println("===== PayPal Payment =====");
        Checkout checkout1 = new Checkout(new PayPalPayment());
        checkout1.checkout(2500);

        System.out.println();

        System.out.println("===== Stripe Payment =====");
        Checkout checkout2 = new Checkout(new StripeAdapter());
        checkout2.checkout(5000);
    }
}