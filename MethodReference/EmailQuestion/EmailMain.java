package MethodReference.EmailQuestion;

public class EmailMain
{
    public static void main(String[] args)
    {
        EmailService emailService = new EmailService();
        Notification notification = emailService::sendEmail;
        notification.send("sriramsanjeev100@gmail.com");
    }
}
