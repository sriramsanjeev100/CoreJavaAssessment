package org.LibraryManagement.dao;

import org.LibraryManagement.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.util.List;

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
        session.persist(entity);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(T entity)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(entity);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(ID id)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        T entity = session.find(entityClass, id);
        if(entity != null)
        {
            session.remove(entity);
        }
        transaction.commit();
        session.close();
    }

    @Override
    public T findById(ID id)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        T entity = session.find(entityClass, id);
        session.close();
        return entity;
    }

    @Override
    public List<T> findAll()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<T> entities = session
                .createQuery("FROM " + entityClass.getSimpleName(), entityClass)
                .list();

        session.close();
        return entities;
    }
}