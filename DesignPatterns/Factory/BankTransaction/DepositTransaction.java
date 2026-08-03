package DesignPatterns.Factory.BankTransaction;

public class DepositTransaction implements Transaction
{
    private double amount;

    public DepositTransaction(double amount)
    {
        this.amount = amount;
    }

    @Override
    public String process()
    {
        return "Deposit Successful : Rs." + amount;
    }

    @Override
    public double getAmount()
    {
        return amount;
    }

    @Override
    public boolean isSuccessful()
    {
        return true;
    }

    @Override
    public String getType()
    {
        return "Deposit";
    }
}