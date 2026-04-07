package Data;

import Domain.Interface.Base.IBaseRepository;
import Domain.Model.Base.BaseModel;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.lang.reflect.ParameterizedType;
import java.util.List;

public class BaseRepository<TModel extends BaseModel> implements IBaseRepository<TModel>
{
    private final Class<TModel> entityClass = (Class<TModel>) ((ParameterizedType) getClass()
            .getGenericSuperclass()).getActualTypeArguments()[0];

    @Override
    public List<TModel> GetAll()
    {
        try (Session session = HibernateHelper.getSessionFactory().openSession())
        {
            return session.createQuery("from " + entityClass.getSimpleName(), entityClass).list();
        }
    }

    @Override
    public TModel GetById(int id)
    {
        try (Session session = HibernateHelper.getSessionFactory().openSession())
        {
            return session.get(entityClass, id);
        }
    }

    @Override
    public TModel Create(TModel model)
    {
        Transaction transaction = null;
        try (Session session = HibernateHelper.getSessionFactory().openSession())
        {
            transaction = session.beginTransaction();
            session.persist(model);
            transaction.commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            return model;
        }
    }

    @Override
    public TModel Update(TModel model)
    {
        Transaction transaction = null;
        try (Session session = HibernateHelper.getSessionFactory().openSession())
        {
            transaction = session.beginTransaction();
            session.merge(model);
            transaction.commit();
        }
        catch (Exception e)
        {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
        finally
        {
            return model;
        }
    }

    @Override
    public void DeleteById(int id)
    {
        Transaction transaction = null;
        try (Session session = HibernateHelper.getSessionFactory().openSession())
        {
            transaction = session.beginTransaction();
            TModel model = GetById(id);
            if (model != null)
            {
                session.remove(model);
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
