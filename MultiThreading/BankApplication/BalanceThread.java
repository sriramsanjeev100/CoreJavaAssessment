package MultiThreading.BankApplication;

public class BalanceThread extends Thread
{
    private BankAccount account;
    public BalanceThread(BankAccount account)
    {
        this.account = account;
    }

    @Override
    public void run()
    {
        account.checkBalance();
    }
}
