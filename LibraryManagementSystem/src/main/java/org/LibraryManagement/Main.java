package org.LibraryManagement;

import org.LibraryManagement.entity.Book;
import org.LibraryManagement.repository.BookRepository;
import org.LibraryManagement.util.HibernateUtil;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        BookRepository repository = new BookRepository();
        Book book1 = new Book(
                "It Ends With Us",
                "Colleen Hoover",
                "Romance",
                5,
                5);

        Book book2 = new Book(
                "It Starts With Us",
                "Colleen Hoover",
                "Romance",
                3,
                3);


        repository.saveBook(book1);
        repository.saveBook(book2);

        List<Book> books = repository.displayBooks();

        System.out.println("===== BOOK LIST =====");
        for (Book book : books)
        {
            System.out.println(book);
            System.out.println("----------------------------");
        }

        HibernateUtil.shutdown();
    }
}