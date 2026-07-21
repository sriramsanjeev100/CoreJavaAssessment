package SealedClass.OnlineShopping;

public sealed interface Payment permits CreditCardPayment, PayPalPayment, UPIPayment
{
    void pay(double amount);
}
