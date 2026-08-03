package DesignPatterns.Singleton.EmailApplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class EmailMain
{
    public static void main(String[] args)
    {
        EmailService email = new EmailService();

        ExecutorService executor =
                ExecutorServiceSingleton.getExecutor();

        executor.execute(() ->
        {
            email.sendEmail("HR",
                    "Welcome to the company");
        });

        executor.execute(() ->
        {
            email.sendEmail("Salary",
                    "Salary Slip Generated");
        });

        executor.execute(() ->
        {
            email.sendEmail("Password Reset",
                    "Reset Link Sent");
        });

        executor.execute(() ->
        {
            email.sendEmail("Marketing",
                    "Festival Offer");
        });

        executor.shutdown();

        try
        {
            executor.awaitTermination(10, TimeUnit.SECONDS);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("All Emails Sent");
    }
}