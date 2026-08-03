package DesignPatterns.Factory.BankTransaction;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BankMain
{
    public static void main(String[] args)
    {
        List<Transaction> transactions = Arrays.asList(
                TransactionFactory.createTransaction("Deposit",5000),
                TransactionFactory.createTransaction("Withdraw",2000),
                TransactionFactory.createTransaction("Transfer",7000),
                TransactionFactory.createTransaction("Deposit",3000),
                TransactionFactory.createTransaction("Withdraw",1500)
        );

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(Transaction transaction : transactions)
        {
            executor.execute(()->
            {
                System.out.println(transaction.process());
            });
        }

        executor.shutdown();

        try
        {
            executor.awaitTermination(10, TimeUnit.SECONDS);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        double totalDeposit =
                transactions.stream()
                        .filter(t->t.getType().equals("Deposit"))
                        .mapToDouble(Transaction::getAmount)
                        .sum();

        double totalWithdraw =
                transactions.stream()
                        .filter(t->t.getType().equals("Withdraw"))
                        .mapToDouble(Transaction::getAmount)
                        .sum();

        double largestTransaction =
                transactions.stream()
                        .mapToDouble(Transaction::getAmount)
                        .max()
                        .orElse(0);

        long successfulTransactions =
                transactions.stream()
                        .filter(Transaction::isSuccessful)
                        .count();

        System.out.println();

        System.out.println("===== Transaction Summary =====");
        System.out.println("Total Deposits : Rs." + totalDeposit);
        System.out.println("Total Withdrawals : Rs." + totalWithdraw);
        System.out.println("Largest Transaction : Rs." + largestTransaction);
        System.out.println("Successful Transactions : " + successfulTransactions);
    }
}