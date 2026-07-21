package ExceptionHandling;

public class BankAccount
{
    int accountNumber;
    double balance;

    public BankAccount(int accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException
    {
        if (amount<=0)
        {
            throw new InsufficientBalanceException("Withdrawal Amount must be greater than 0");
        }
        if (amount > balance)
        {
            throw new InsufficientBalanceException("Withdrawal Amount must be less than Balance");
        }

        balance-=amount;

        System.out.println("Withdrawn Successfully");
        System.out.println("Withdrawal Amount is Rs."+amount);
        System.out.println("Remaining Balance is Rs."+balance);
    }
}
