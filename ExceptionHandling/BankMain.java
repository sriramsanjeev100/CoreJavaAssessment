package ExceptionHandling;

import java.util.Scanner;

public class BankMain
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        BankAccount account = new BankAccount(1001,50000);

        System.out.println("Enter Withdrawal Amount : ");
        double amount=sc.nextDouble();

        try
        {
            account.withdraw(amount);
        }
        catch (InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
