package MultiThreading.BankApplicationNotifyWait;

public class BankAccount
{
    private double balance;
    public BankAccount(double balance)
    {
        this.balance = balance;
    }

    public synchronized void withdraw(double amount)
    {
        System.out.println("Customer 1 wants to withdraw $" + amount);
        while (balance < amount)
        {
            System.out.println("Insufficient Balance!");
            System.out.println("Customer 1 is waiting for deposit...");

            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        balance -= amount;

        System.out.println("Withdrawal Successful");
        System.out.println("Amount Withdrawn : $" + amount);
        System.out.println("Remaining Balance : $" + balance);
    }

    public synchronized void deposit(double amount)
    {
        System.out.println("Customer 2 depositing $" + amount);
        balance += amount;
        System.out.println("Deposit Successful");
        System.out.println("Updated Balance : $" + balance);

        notify();
    }

    public double getBalance()
    {
        return balance;
    }
}
