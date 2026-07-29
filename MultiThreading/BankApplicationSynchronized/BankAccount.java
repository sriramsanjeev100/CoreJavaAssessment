package MultiThreading.BankApplicationSynchronized;

public class BankAccount
{
    private double balance;
    public BankAccount(double balance)
    {
        this.balance = balance;
    }

    public synchronized void deposit(double amount)
    {
        System.out.println("\n===== Deposit Transaction =====");
        System.out.println("Thread : " + Thread.currentThread().getName());
        System.out.println("Amount Deposited : $" + amount);

        balance += amount;
        System.out.println("Updated Balance : $" + balance);
    }

    public synchronized void withdraw(double amount)
    {
        System.out.println("\n===== Withdraw Transaction =====");
        System.out.println("Thread : " + Thread.currentThread().getName());

        if (amount <= balance)
        {
            balance -= amount;
            System.out.println("Amount Withdrawn : $" + amount);
            System.out.println("Updated Balance : $" + balance);
        }
        else
        {
            System.out.println("Insufficient Balance!");
            System.out.println("Available Balance : $" + balance);
        }
    }

    public synchronized double getBalance()
    {
        return balance;
    }
}