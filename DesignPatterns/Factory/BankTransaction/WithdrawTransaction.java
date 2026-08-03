package DesignPatterns.Factory.BankTransaction;

public class WithdrawTransaction implements Transaction
{
    private double amount;

    public WithdrawTransaction(double amount)
    {
        this.amount = amount;
    }

    @Override
    public String process()
    {
        return "Withdraw Successful : Rs." + amount;
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
        return "Withdraw";
    }
}