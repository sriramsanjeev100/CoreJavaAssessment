package org.LibraryManagement.menu;

import org.LibraryManagement.exception.BookNotFoundException;
import org.LibraryManagement.exception.BookUnavailableException;
import org.LibraryManagement.exception.MemberNotFoundException;
import org.LibraryManagement.service.BorrowService;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BorrowMenu
{
    private static final BorrowService service = new BorrowService();

    public static void borrowBook(Scanner sc)
    {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        try
        {
            executor.submit(() ->
            {
                try
                {
                    service.borrowBook(1, 3);
                }
                catch (MemberNotFoundException | BookNotFoundException | BookUnavailableException e)
                {
                    System.out.println(e.getMessage());
                }
            });

            executor.submit(() ->
            {
                try
                {
                    service.borrowBook(3, 3);
                }
                catch (MemberNotFoundException | BookNotFoundException | BookUnavailableException e)
                {
                    System.out.println(e.getMessage());
                }
            });

            executor.submit(() ->
            {
                try
                {
                    service.borrowBook(4, 4);
                }
                catch (MemberNotFoundException | BookNotFoundException | BookUnavailableException e)
                {
                    System.out.println(e.getMessage());
                }
            });
        }
        finally
        {
            executor.shutdown();
            try
            {
                executor.awaitTermination(5, TimeUnit.SECONDS);
            }
            catch (InterruptedException e)
            {
                Thread.currentThread().interrupt();
            }
        }
    }
}