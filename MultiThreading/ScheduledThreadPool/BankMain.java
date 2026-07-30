package MultiThreading.ScheduledThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class BankMain
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount(5000);
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);

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
            account.deposit(500);
        });

        executor.scheduleAtFixedRate(() ->
        {
            account.displayBalance();
        },0,5, TimeUnit.SECONDS);

        executor.scheduleAtFixedRate(() ->
        {
            account.lowBalanceAlert();
        },0,10, TimeUnit.SECONDS);

        executor.scheduleAtFixedRate(() ->
        {
            account.applyInterest();
        },0,15, TimeUnit.SECONDS);
    }
}