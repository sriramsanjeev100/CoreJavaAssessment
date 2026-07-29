package MultiThreading.BankApplicationExecutorService;

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
        System.out.println(Thread.currentThread().getName() + " Deposited : $" + amount);
        System.out.println("Balance : $" + balance);
    }

    public synchronized void withdraw(double amount)
    {
        if (balance >= amount)
        {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " Withdrew : $" + amount);
            System.out.println("Balance : $" + balance);
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
}