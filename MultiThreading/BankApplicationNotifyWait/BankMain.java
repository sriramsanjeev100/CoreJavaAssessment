package MultiThreading.BankApplicationNotifyWait;

public class BankMain
{
    public static void main(String[] args) throws InterruptedException
    {
        BankAccount account = new BankAccount(1000);
        System.out.println("Initial Balance : $" + account.getBalance());

        Thread customer1 = new Thread(() ->
        {
            account.withdraw(5000);
        });

        Thread customer2 = new Thread(() ->
        {
            try
            {
                Thread.sleep(3000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            account.deposit(7000);
        });

        customer1.start();
        customer2.start();

        customer1.join();
        customer2.join();

        System.out.println();
        System.out.println("Final Account Balance : $" + account.getBalance());
    }
}