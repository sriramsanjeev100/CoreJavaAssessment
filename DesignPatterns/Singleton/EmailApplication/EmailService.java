package DesignPatterns.Singleton.EmailApplication;

public class EmailService
{
    public void sendEmail(String module, String message)
    {
        System.out.println(module + " : " + message);

        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println(module + " Email Sent");
        System.out.println();
    }
}