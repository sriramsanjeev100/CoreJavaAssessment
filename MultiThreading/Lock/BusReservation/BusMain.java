package MultiThreading.Lock.BusReservation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BusMain
{
    public static void main(String[] args)
    {
        Bus bus = new Bus();

        System.out.println("===== Bus Reservation System =====");
        System.out.println("Initial Available Seats : " + bus.getAvailableSeats());
        System.out.println();

        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(() ->
        {
            bus.bookSeat("Sriram", 2);
        });

        executor.execute(() ->
        {
            bus.bookSeat("Leo", 1);
        });

        executor.execute(() ->
        {
            bus.bookSeat("John", 1);
        });

        executor.execute(() ->
        {
            bus.bookSeat("Aaron", 2);
        });

        executor.execute(() ->
        {
            bus.bookSeat("Archa", 1);
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

        System.out.println();
        System.out.println("===== Reservation Completed =====");
        System.out.println("Available Seats : " + bus.getAvailableSeats());
    }
}