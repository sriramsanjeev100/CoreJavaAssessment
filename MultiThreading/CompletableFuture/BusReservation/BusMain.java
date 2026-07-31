package MultiThreading.CompletableFuture.BusReservation;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BusMain
{
    public static void main(String[] args)
    {
        Bus bus = new Bus();

        System.out.println("===== Bus Reservation System =====");
        System.out.println("Initial Seats : " + bus.getAvailableSeats());
        System.out.println();

        ExecutorService executor = Executors.newFixedThreadPool(5);

        CompletableFuture<Void> p1 =
                CompletableFuture.runAsync(() ->
                {
                    bus.bookSeat("Sriram",2);
                }, executor);

        CompletableFuture<Void> p2 =
                CompletableFuture.runAsync(() ->
                {
                    bus.bookSeat("Leo",1);
                }, executor);

        CompletableFuture<Void> p3 =
                CompletableFuture.runAsync(() ->
                {
                    bus.bookSeat("John",1);
                }, executor);

        CompletableFuture<Void> p4 =
                CompletableFuture.runAsync(() ->
                {
                    bus.bookSeat("Aaron",2);
                }, executor);

        CompletableFuture<Void> p5 =
                CompletableFuture.runAsync(() ->
                {
                    bus.bookSeat("Archa",1);
                }, executor);

        CompletableFuture.allOf(p1,p2,p3,p4,p5).join();
        executor.shutdown();

        try
        {
            executor.awaitTermination(10, TimeUnit.SECONDS);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("===== Reservation Completed =====");
        System.out.println("Available Seats : " + bus.getAvailableSeats());
    }
}