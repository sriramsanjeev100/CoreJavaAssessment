package MultiThreading.BankApplicationExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankMain
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount(5000);
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(() ->
        {
            account.deposit(2000);
        });

        executor.execute(() ->
        {
            account.withdraw(1500);
        });

        executor.execute(() ->
        {
            account.checkBalance();
        });

        executor.shutdown();
    }
}