package Domain.Interface.Product;

import Domain.Interface.Base.IBaseRepository;
import Domain.Model.Product.ProductModel;

import java.util.List;

public interface IProductService extends IBaseRepository<ProductModel>
{
    List<ProductModel> GetByCategory(int categoryId);
}
