package org.LibraryManagement.dao;

import org.LibraryManagement.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class AbstractGenericDAO<T, ID extends Serializable> implements GenericDAO<T, ID>
{
    private final Class<T> entityClass;
    protected AbstractGenericDAO(Class<T> entityClass)
    {
        this.entityClass = entityClass;
    }

    @Override
    public void save(T entity)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try
        {
            session.persist(entity);
            transaction.commit();
        }
        catch (Exception e)
        {
            transaction.rollback();
            throw e;
        }
        finally
        {
            session.close();
        }
    }

    @Override
    public void update(T entity)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try
        {
            session.merge(entity);
            transaction.commit();
        }
        catch (Exception e)
        {
            transaction.rollback();
            throw e;
        }
        finally
        {
            session.close();
        }
    }

    @Override
    public void delete(ID id)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try
        {
            T entity = session.find(entityClass, id);

            if (entity != null)
            {
                session.remove(entity);
            }

            transaction.commit();
        }
        catch (Exception e)
        {
            transaction.rollback();
            throw e;
        }
        finally
        {
            session.close();
        }
    }

    @Override
    public Optional<T> findById(ID id)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            T entity = session.find(entityClass, id);
            return Optional.ofNullable(entity);
        }
        finally
        {
            session.close();
        }
    }

    @Override
    public List<T> findAll()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            return session.createQuery("FROM " + entityClass.getSimpleName(), entityClass).list();
        }
        finally
        {
            session.close();
        }
    }
}