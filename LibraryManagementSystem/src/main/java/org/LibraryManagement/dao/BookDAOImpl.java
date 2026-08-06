package org.LibraryManagement.dao;
import org.LibraryManagement.entity.Book;

public class BookDAOImpl extends AbstractGenericDAO<Book, Integer> implements BookDAO
{
    public BookDAOImpl()
    {
        super(Book.class);
    }
}