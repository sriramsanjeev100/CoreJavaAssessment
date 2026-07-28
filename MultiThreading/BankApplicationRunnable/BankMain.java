package MultiThreading.BankApplicationRunnable;

public class BankMain
{
    public static void main(String[] args)
    {
        BankAccount customer1 = new BankAccount(1001, "Sriram", 5000);
        BankAccount customer2 = new BankAccount(1002, "Leo", 3000);
        BankAccount customer3 = new BankAccount(1003, "Archa", 7000);

        Thread t1 = new Thread(() -> customer1.deposit(2000));
        Thread t2 = new Thread(() -> customer2.withdraw(4000));
        Thread t3 = new Thread(() -> customer3.checkBalance());

        t1.start();
        t2.start();
        t3.start();
    }
}