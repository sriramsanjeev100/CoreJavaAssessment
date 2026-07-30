package MultiThreading.SingleThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PrinterMain
{
    public static void main(String[] args)
    {
        Printer printer = new Printer();
        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.execute(() ->
        {
            printer.printDocument("Sriram", "Resume.pdf");
        });

        executor.execute(() ->
        {
            printer.printDocument("Leo", "Record.docx");
        });

        executor.execute(() ->
        {
            printer.printDocument("John", "Resume.pdf");
        });

        executor.execute(() ->
        {
            printer.printDocument("Archa", "Bill.pptx");
        });

        executor.execute(() ->
        {
            printer.printDocument("Aaron", "SalarySheet.xlsx");
        });

        executor.shutdown();

        try
        {
            executor.awaitTermination(15, TimeUnit.SECONDS);
            System.out.println("All print jobs completed.");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}