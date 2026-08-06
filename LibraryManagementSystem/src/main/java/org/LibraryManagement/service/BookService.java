package org.LibraryManagement.service;

import org.LibraryManagement.dao.BookDAO;
import org.LibraryManagement.dao.BookDAOImpl;
import org.LibraryManagement.entity.Book;

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

    public Book findBookById(int bookId)
    {
        return bookDAO.findById(bookId);
    }

    public List<Book> findAllBooks()
    {
        return bookDAO.findAll();
    }
}