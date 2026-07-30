package MultiThreading.CallableAndFuture.SharedBankAccount;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class BankMain
{
    public static void main(String[] args) throws Exception
    {
        BankAccount account = new BankAccount(20000);
        System.out.println("===== Initial Balance =====");
        System.out.println("Current Balance: Rs."+account.getBalance());
        System.out.println();
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Callable<String> customer1 = () ->
        {
            return account.deposit("Sriram", 2000);
        };

        Callable<String> customer2 = () ->
        {
            return account.withdraw("Leo", 1500);
        };

        Callable<String> customer3 = () ->
        {
            return account.deposit("John", 5000);
        };

        Callable<String> customer4 = () ->
        {
            return account.withdraw("Aaron", 4000);
        };

        Callable<String> customer5 = () ->
        {
            return account.deposit("Sona", 1000);
        };

        Future<String> result1 = executor.submit(customer1);
        Future<String> result2 = executor.submit(customer2);
        Future<String> result3 = executor.submit(customer3);
        Future<String> result4 = executor.submit(customer4);
        Future<String> result5 = executor.submit(customer5);


        System.out.println(result1.get());
        System.out.println();

        System.out.println(result2.get());
        System.out.println();

        System.out.println(result3.get());
        System.out.println();

        System.out.println(result4.get());
        System.out.println();

        System.out.println(result5.get());
        System.out.println();

        System.out.println("===== Final Balance =====");
        System.out.println("Final Balance: Rs." + account.getBalance());
        executor.shutdown();
    }
}