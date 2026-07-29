package MultiThreading.BankApplicationYield;

public class BankAccount
{
    private double balance;
    public BankAccount(double balance)
    {
        this.balance = balance;
    }

    public synchronized void deposit(double amount)
    {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited $" + amount + " | Balance : $" + balance);
    }

    public synchronized void withdraw(double amount)
    {
        if (balance >= amount)
        {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew $" + amount + " | Balance : $" + balance);
        }
        else
        {
            System.out.println("Insufficient Balance!");
        }
    }

    public synchronized void checkBalance()
    {
        System.out.println(Thread.currentThread().getName() + " Current Balance : $" + balance);
    }

    public synchronized double getBalance()
    {
        return balance;
    }
}