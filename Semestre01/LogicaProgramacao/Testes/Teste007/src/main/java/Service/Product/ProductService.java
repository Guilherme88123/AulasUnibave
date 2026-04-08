package Service.Product;

import Data.BaseRepository;
import Data.HibernateHelper;
import Domain.Interface.Product.IProductService;
import Domain.Model.Product.ProductModel;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;

import java.util.List;

public class ProductService
        extends BaseRepository<ProductModel>
        implements IProductService
{
    public List<ProductModel> GetByCategory(int categoryId)
    {
        try (Session session = HibernateHelper.getSessionFactory().openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<ProductModel> cq = cb.createQuery(ProductModel.class);
            Root<ProductModel> product = cq.from(ProductModel.class);

            cq.select(product).where(cb.equal(product.get("categoryId"), categoryId));

            return session.createQuery(cq).getResultList();
        }
    }
}
