package MultiThreading.NotificationServiceCachedThreadPool;

public class NotificationService
{
    public void sendNotification(String customerName)
    {
        System.out.println(Thread.currentThread().getName() + " is sending notification to " + customerName);
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " notification sent to " + customerName);
    }
}