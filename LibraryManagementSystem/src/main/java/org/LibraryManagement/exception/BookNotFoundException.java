package org.LibraryManagement.exception;

public class BookNotFoundException extends Exception
{
    public BookNotFoundException(String message)
    {
        super(message);
    }
}