/**
 * ATM Program that lets user deposit and withdraw money, check account balance and Exit
 * @author Sriram
 */

package CntrlStmtExamples;

import java.util.Scanner;

public class ATM
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double balance = 0;
        int ch;

        do
        {
            System.out.println("\n====ATM MENU====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice : ");
            ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.println("Enter amount to deposit");
                    double deposit = sc.nextDouble();
                    balance = balance + deposit;
                    System.out.println("Amount Deposited Successfully");
                    break;

                case 2:
                    System.out.println("Enter amount to withdraw");
                    double withdraw = sc.nextDouble();
                    if (withdraw<=balance)
                    {
                        balance = balance - withdraw;
                    }
                    else
                    {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 3:
                    System.out.println("Balance Amount : Rs. " + balance);
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
        while (ch!=4);
        sc.close();
    }
}