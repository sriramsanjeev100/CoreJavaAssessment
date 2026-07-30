package MultiThreading.ScheduledThreadPool;

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
    }

    public synchronized void withdraw(double amount)
    {
        if(balance >= amount)
        {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " Withdrew : $" + amount);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }

    public synchronized void displayBalance()
    {
        System.out.println("Current Balance : $" + balance);
    }

    public synchronized void applyInterest()
    {
        balance += balance * 0.02;
        System.out.println("Interest Applied");
        System.out.println("Balance : $" + balance);
    }

    public synchronized void lowBalanceAlert()
    {
        if(balance < 3000)
        {
            System.out.println("Low Balance Alert!");
        }
    }
}