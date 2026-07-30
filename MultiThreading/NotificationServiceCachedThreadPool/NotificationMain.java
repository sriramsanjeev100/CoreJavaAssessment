package MultiThreading.NotificationServiceCachedThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NotificationMain
{
    public static void main(String[] args)
    {
        NotificationService notification = new NotificationService();
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