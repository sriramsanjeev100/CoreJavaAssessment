package org.LibraryManagement.repository;

import org.LibraryManagement.util.HibernateUtil;
import org.LibraryManagement.entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BookRepository
{
    public void saveBook(Book book)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try
        {
            transaction = session.beginTransaction();
            session.persist(book);
            transaction.commit();
            System.out.println("Book Added Successfully");
        }
        catch (Exception e)
        {
            if (transaction != null)
            {
                transaction.rollback();
            }

            e.printStackTrace();
        }
        finally
        {
            session.close();
        }
    }

    public List<Book> displayBooks()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();

        List<Book> books = session
                .createQuery("FROM Book", Book.class)
                .list();

        session.close();
        return books;
    }
}