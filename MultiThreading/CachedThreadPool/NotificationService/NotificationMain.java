package MultiThreading.CachedThreadPool.NotificationService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NotificationMain
{
    public static void main(String[] args)
    {
        Notification notification = new Notification();
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 1; i <= 20; i++)
        {
            String customerName = "Customer " + i;
            executor.execute(() ->
            {
                notification.sendNotification(customerName);
            });
        }
        executor.shutdown();
    }
}