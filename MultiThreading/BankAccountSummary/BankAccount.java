package MultiThreading.BankAccountSummary;
import java.util.concurrent.CompletableFuture;

public class BankAccount
{
    public static void main(String[] args)
    {
        CompletableFuture<String> customerFuture =
                CompletableFuture.supplyAsync(() ->
                {
                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                    return "Sriram";
                });

        CompletableFuture<Double> balanceFuture =
                CompletableFuture.supplyAsync(() ->
                {
                    try
                    {
                        Thread.sleep(3000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                    return 30000.0;
                });

        CompletableFuture<String> detailsFuture =
                customerFuture.thenCombine(balanceFuture,
                        (name, balance) -> "Account Holder : " + name + "\nAccount Balance: Rs." + balance);

        detailsFuture.thenAccept(System.out::println);
        detailsFuture.join();
    }
}