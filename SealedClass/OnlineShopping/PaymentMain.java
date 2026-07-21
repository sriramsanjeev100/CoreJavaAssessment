package SealedClass.OnlineShopping;

public class PaymentMain
{
    public static void main(String[] args)
    {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new GooglePay();
        Payment p3 = new PhonePe();
        Payment p4 = new PaypalBusinessPayment();
        Payment p5 = new PaypalPersonalPayment();

        p1.pay(1200);
        p2.pay(500);
        p3.pay(750);
        p4.pay(2500);
        p5.pay(900);
    }
}
