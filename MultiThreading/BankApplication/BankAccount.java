package MultiThreading.BankApplication;

public class BankAccount
{
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public synchronized void deposit(double amount)
    {
        balance += amount;
        System.out.println("\n===== Deposit Transaction =====" + "\nCustomer Name: " + accountHolder + "\nAccount Number: " + accountNumber + "\nAmount Deposited: " + amount + "\nCustomer Balance: " + balance);
    }

    public synchronized void withdraw(double amount)
    {
        System.out.println("===== Withdraw Transaction =====" + "\nCustomer Name: " + accountHolder + "\nAccount Number: " + accountNumber);
        if (amount <= balance)
        {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount + "\nCustomer Balance: " + balance);
        }
        else
        {
            System.out.println("Amount: " + amount + "\nInsufficient funds!");
        }
    }

    public void checkBalance()
    {
        System.out.println("\n===== Balance Enquiry =====" + "\nCustomer Name: " + accountHolder + "\nAccount Number: " + accountNumber + "\nTransaction: Balance Check" + "\nBalance: " + balance);
    }
}
