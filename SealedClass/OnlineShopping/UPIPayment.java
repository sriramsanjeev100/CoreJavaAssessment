package SealedClass.OnlineShopping;

public sealed interface UPIPayment extends Payment permits GooglePay,PhonePe
{

}
