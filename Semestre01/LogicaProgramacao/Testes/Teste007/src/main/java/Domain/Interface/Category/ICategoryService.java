package Domain.Interface.Category;

import Domain.Interface.Base.IBaseRepository;
import Domain.Model.Category.CategoryModel;
import Domain.Model.Product.ProductModel;

public interface ICategoryService extends IBaseRepository<CategoryModel>
{
    ProductModel GetMostValuableProduct(int categoryId);
}
