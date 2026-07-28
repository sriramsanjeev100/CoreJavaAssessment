package MultiThreading.BankApplicationSynchronized;

public class BankMain
{
    public static void main(String[] args) throws InterruptedException
    {
        BankAccount account = new BankAccount(10000);

        System.out.println();
        System.out.println("===== Initial Account Balance =====");
        System.out.println("Initial Account Balance : $" + account.getBalance());

        Thread customer1 = new Thread(() ->
        {
            account.deposit(2000);
        }, "Customer 1");

        Thread customer2 = new Thread(() ->
        {
            account.withdraw(1000);
        }, "Customer 2");

        Thread customer3 = new Thread(() ->
        {
            account.checkBalance();
        }, "Customer 3");

        customer1.start();
        customer2.start();
        customer3.start();

        customer1.join();
        customer2.join();
        customer3.join();

        System.out.println();
        System.out.println("===== Final Account Balance =====");
        System.out.println("Final Account Balance : $" + account.getBalance());
    }
}