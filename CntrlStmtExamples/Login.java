package CntrlStmtExamples;

import java.util.Scanner;

public class Login
{
    private static final int maxAttempts = 3;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "1234";

        int attempts = 1;

        while(attempts <= maxAttempts)
        {
            System.out.print("Enter username: ");
            String username = sc.next();

            System.out.print("Enter password: ");
            String password = sc.next();

            if (username.equals(correctUsername) && password.equals(correctPassword))
            {
                System.out.println("Login Successful");
                break;
            }
            else
            {
                if (attempts == maxAttempts)
                {
                    System.out.println("Maximum attempts reached. Access Denied!");
                }
                else
                {
                    System.out.println("Try Again");
                }
            }

            attempts++;
        }
        sc.close();
    }
}