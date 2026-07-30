package MultiThreading.CallableAndFuture.SharedBankAccount;

public class BankAccount
{
    private double balance;
    public BankAccount(double balance)
    {
        this.balance = balance;
    }

    public synchronized String deposit(String customerName, double amount)
    {
        balance += amount;
        return customerName + " deposited Rs." + amount + "\nCurrent Balance : Rs." + balance;
    }

    public synchronized String withdraw(String customerName, double amount)
    {
        if (balance >= amount)
        {
            balance -= amount;
            return customerName + " withdrew Rs." + amount + "\nCurrent Balance : Rs." + balance;
        }

        return customerName + " - Insufficient Balance";
    }

    public double getBalance()
    {
        return balance;
    }
}
