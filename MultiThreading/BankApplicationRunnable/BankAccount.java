package MultiThreading.BankApplicationRunnable;

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
        System.out.println("\n===== Deposit Transaction =====" + "\nCustomer Name: " + accountHolder + "\nAccount Number: " + accountNumber + "\nTransaction: Deposit" + "\nAmount Deposited: " + amount + "\nUpdated Balance: " + balance);
    }

    public synchronized void withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance -= amount;
            System.out.println("\n===== Withdraw Transaction =====" + "\nCustomer Name: " + accountHolder + "\nAccount Number: " + accountNumber + "\nTranaction: Withdraw" + "\nAmount Withdrawn: " + amount + "\nUpdated Balance: " + balance);
        }
        else
        {
            System.out.println("\n===== Withdraw Transaction =====" + "\nCustomer Name: " + accountHolder + "\nAccount Number: " + accountNumber + "\nTransaction: Withdraw" + "\nAmount: " + amount + "\nInsufficient Balance!" + "\nAvailable Balance: " + balance);
        }
    }

    public synchronized void checkBalance()
    {
        System.out.println("\n===== Balance Enquiry =====" + "\nCustomer Name: " + accountHolder + "\nAccount Number: " + accountNumber + "\nTransaction: Balance Check" + "\nBalance: " + balance);
    }
}