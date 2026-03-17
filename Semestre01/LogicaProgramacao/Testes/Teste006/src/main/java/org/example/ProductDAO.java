package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ProductDAO
{
    // CREATE
    public void create(Product product)
    {
        Transaction transaction = null;
        try (Session session = HibernateHelper.getSessionFactory().openSession())
        {
            transaction = session.beginTransaction();
            session.persist(product);
            transaction.commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    // READ ALL
    public List<Product> getAll()
    {
        try (Session session = HibernateHelper.getSessionFactory().openSession())
        {
            return session.createQuery("from product", Product.class).list();
        }
    }

    // READ by ID
    public Product getById(int id)
    {
        try (Session session = HibernateHelper.getSessionFactory().openSession())
        {
            return session.get(Product.class, id);
        }
    }

    // UPDATE
    public void update(Product product)
    {
        Transaction transaction = null;
        try (Session session = HibernateHelper.getSessionFactory().openSession())
        {
            transaction = session.beginTransaction();
            session.merge(product);
            transaction.commit();
        }
        catch (Exception e)
        {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    // DELETE
    public void delete(int id)
    {
        Transaction transaction = null;
        try (Session session = HibernateHelper.getSessionFactory().openSession())
        {
            transaction = session.beginTransaction();
            Product product = session.get(Product.class, id);
            if (product != null)
            {
                session.remove(product);
            }
            transaction.commit();
        }
        catch (Exception e)
        {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
}
