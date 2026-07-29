package MultiThreading.BankApplicationYield;

public class BankMain
{
    public static void main(String[] args) throws InterruptedException
    {
        BankAccount account = new BankAccount(5000);
        Thread depositThread = new Thread(() ->
        {
            for (int i = 1; i <= 5; i++)
            {
                account.deposit(1000);
                if (i == 3)
                {
                    System.out.println();
                    System.out.println("Deposit Thread Yield is called here.");
                    System.out.println();
                    Thread.yield();
                }
            }
        }, "Deposit Thread");

        Thread withdrawThread = new Thread(() ->
        {
            for (int i = 1; i <= 5; i++)
            {
                account.withdraw(500);
            }
        }, "Withdraw Thread");

        Thread balanceThread = new Thread(() ->
        {
            for (int i = 1; i <= 5; i++)
            {
                account.checkBalance();
            }
        }, "Balance Thread");

        depositThread.start();
        withdrawThread.start();
        balanceThread.start();

        depositThread.join();
        withdrawThread.join();
        balanceThread.join();

        System.out.println();
        System.out.println("===== Final Account Balance =====");
        System.out.println("Final Balance : $" + account.getBalance());

    }
}