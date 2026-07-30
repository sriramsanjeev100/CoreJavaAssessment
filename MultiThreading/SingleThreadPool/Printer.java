package MultiThreading.SingleThreadPool;

public class Printer
{
    public void printDocument(String employeeName, String documentName)
    {
        System.out.println("Employee : " + employeeName);
        System.out.println("Document : " + documentName);

        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Printing Completed");
        System.out.println("-------------------------");
    }
}