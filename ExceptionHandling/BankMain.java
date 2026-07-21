package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankMain
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        BankAccount account = new BankAccount(1001,50000);

        try
        {
            System.out.println("Enter Withdrawal Amount : ");
            double amount=sc.nextDouble();
            account.withdraw(amount);
        }
        catch (InputMismatchException e)
        {
            System.out.println("Invalid Input. Enter Numbers Only. ");
        }
        catch (InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            sc.close();
        }
    }
}
