package MultiThreading.CachedThreadPool.FoodDelivery;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FoodDeliveryMain
{
    public static void main(String[] args)
    {
        FoodOrder order = new FoodOrder();
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 1; i <= 15; i++)
        {
            String customerName = "Customer " + i;
            executor.execute(() ->
            {
                order.processOrder(customerName);
            });
        }
        executor.shutdown();
    }
}