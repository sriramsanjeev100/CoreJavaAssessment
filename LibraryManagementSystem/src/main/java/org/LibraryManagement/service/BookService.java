package org.LibraryManagement.service;

import org.LibraryManagement.dao.BookDAO;
import org.LibraryManagement.dao.BookDAOImpl;
import org.LibraryManagement.entity.Book;
import org.LibraryManagement.exception.BookNotFoundException;

import java.util.List;

public class BookService
{
    private final BookDAO bookDAO = new BookDAOImpl();

    public void createBook(Book book)
    {
        bookDAO.save(book);
    }

    public void updateBook(Book book)
    {
        bookDAO.update(book);
    }

    public void deleteBook(int bookId)
    {
        bookDAO.delete(bookId);
    }

    public Book findBookById(int bookId) throws BookNotFoundException
    {
        Book book = bookDAO.findById(bookId);
        if(book == null)
        {
            throw new BookNotFoundException("Book with ID " + bookId + " not found.");
        }

        return book;
    }

    public List<Book> findAllBooks()
    {
        return bookDAO.findAll();
    }
}