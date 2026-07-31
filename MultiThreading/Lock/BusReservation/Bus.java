package MultiThreading.Lock.BusReservation;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bus
{
    private int availableSeats = 5;
    private final Lock lock = new ReentrantLock();

    public void bookSeat(String passengerName, int seatsRequested)
    {
        lock.lock();
        try
        {
            System.out.println(passengerName + " is trying to book " + seatsRequested + " seat(s).");
            if (availableSeats >= seatsRequested)
            {
                availableSeats -= seatsRequested;

                System.out.println("Booking Successful");
                System.out.println("Passenger : " + passengerName);
                System.out.println("Seats Booked : " + seatsRequested);
                System.out.println("Available Seats : " + availableSeats);
            }
            else
            {
                System.out.println("Booking Failed");
                System.out.println("Passenger : " + passengerName);
                System.out.println("Only " + availableSeats + " seat(s) available.");
            }
            System.out.println();
        }
        finally
        {
            lock.unlock();
        }
    }

    public int getAvailableSeats()
    {
        return availableSeats;
    }
}