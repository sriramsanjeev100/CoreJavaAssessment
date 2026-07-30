package MultiThreading.CachedThreadPool.FoodDelivery;

public class FoodOrder
{
    public void processOrder(String customerName)
    {
        System.out.println(Thread.currentThread().getName() + " is processing order for " + customerName);
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " completed order for " + customerName);
    }
}