package Service.Category;

import Data.BaseRepository;
import Domain.Interface.Category.ICategoryService;
import Domain.Model.Category.CategoryModel;
import Domain.Model.Product.ProductModel;

public class CategoryService
    extends BaseRepository<CategoryModel>
    implements ICategoryService
{
    public ProductModel GetMostValuableProduct(int categoryId) {
        return null;
    }
}
