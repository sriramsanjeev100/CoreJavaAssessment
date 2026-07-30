package MultiThreading.Lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BankMain
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount(20000);

        System.out.println("===== Initial Balance =====");
        System.out.println("Current Balance: Rs." + account.getBalance());
        System.out.println();

        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.execute(() ->
        {
            System.out.println(account.deposit("Sriram", 2000));
            System.out.println();
        });

        executor.execute(() ->
        {
            System.out.println(account.withdraw("Leo", 1500));
            System.out.println();
        });

        executor.execute(() ->
        {
            System.out.println(account.deposit("John", 5000));
            System.out.println();
        });

        executor.execute(() ->
        {
            System.out.println(account.withdraw("Aaron", 4000));
            System.out.println();
        });

        executor.execute(() ->
        {
            System.out.println(account.deposit("Sona", 1000));
            System.out.println();
        });

        executor.shutdown();
        try
        {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("===== Final Balance =====");
        System.out.println("Final Balance: Rs." + account.getBalance());
    }
}