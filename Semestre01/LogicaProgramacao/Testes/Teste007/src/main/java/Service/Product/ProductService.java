package Service.Product;

import Data.BaseRepository;
import Domain.Interface.Product.IProductService;
import Domain.Model.Product.ProductModel;

import java.util.List;

public class ProductService
        extends BaseRepository<ProductModel>
        implements IProductService
{
    public List<ProductModel> GetByCategory(int categoryId) {
        return List.of();
    }
}
