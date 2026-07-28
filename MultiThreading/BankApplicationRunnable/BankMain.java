package MultiThreading.BankApplicationRunnable;

public class BankMain
{
    public static void main(String[] args)
    {
        BankAccount customer1 = new BankAccount(1001, "Sriram", 5000);
        BankAccount customer2 = new BankAccount(1002, "Leo", 3000);
        BankAccount customer3 = new BankAccount(1003, "Archa", 7000);

        DepositTask depositTask = new DepositTask(customer1, 2000);
        WithdrawTask withdrawTask = new WithdrawTask(customer2, 4000);
        BalanceTask balanceTask = new BalanceTask(customer3);

        Thread t1 = new Thread(depositTask);
        Thread t2 = new Thread(withdrawTask);
        Thread t3 = new Thread(balanceTask);

        t1.start();
        t2.start();
        t3.start();
    }
}