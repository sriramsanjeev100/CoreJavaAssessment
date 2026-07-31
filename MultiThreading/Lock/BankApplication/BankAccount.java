package MultiThreading.Lock.BankApplication;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount
{
    private double balance;
    Lock lock = new ReentrantLock();

    public BankAccount(double balance)
    {
        this.balance = balance;
    }

    public String deposit(String customerName, double amount)
    {
        lock.lock();
        try
        {
            balance += amount;

            return customerName + " deposited Rs." + amount + "\nCurrent Balance: Rs." + balance;
        }
        finally
        {
            lock.unlock();
        }
    }

    public String withdraw(String customerName, double amount)
    {
        lock.lock();
        try
        {
            if (balance >= amount)
            {
                balance -= amount;
                return customerName + " withdrew Rs." + amount + "\nCurrent Balance: Rs." + balance;
            }

            return customerName + " - Insufficient Balance";
        }
        finally
        {
            lock.unlock();
        }
    }

    public double getBalance()
    {
        lock.lock();
        try
        {
            return balance;
        }
        finally
        {
            lock.unlock();
        }
    }
}