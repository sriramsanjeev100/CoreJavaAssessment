package MultiThreading.BankApplication;

public class BankMain
{
    public static void main(String[] args)
    {
        BankAccount customer1 = new BankAccount(1001, "Sriram", 5000);
        BankAccount customer2 = new BankAccount(1002, "Leo", 3000);
        BankAccount customer3 = new BankAccount(1003, "Archa", 57000);

        DepositThread t1 = new DepositThread(customer1, 2000);
        WithdrawThread t2 = new WithdrawThread(customer2, 4000);
        BalanceThread t3 = new BalanceThread(customer3);

        t1.start();
        t2.start();
        t3.start();
    }
}
