package DesignPatterns.Factory.BankTransaction;

public class TransferTransaction implements Transaction
{
    private double amount;

    public TransferTransaction(double amount)
    {
        this.amount = amount;
    }

    @Override
    public String process()
    {
        return "Transfer Successful : Rs." + amount;
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
        return "Transfer";
    }
}