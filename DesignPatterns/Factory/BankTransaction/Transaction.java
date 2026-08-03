package DesignPatterns.Factory.BankTransaction;

public interface Transaction
{
    String process();
    double getAmount();
    boolean isSuccessful();
    String getType();
}