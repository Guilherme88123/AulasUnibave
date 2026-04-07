package Domain.Model.Category;

import Domain.Model.Base.BaseModel;
import Domain.Model.Product.ProductModel;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "category")
@Table(name = "category")
public class CategoryModel extends BaseModel
{
    @Column(nullable = false, length = 50)
    public String name;

    @OneToMany
    @JoinColumn(name = "id")
    public List<ProductModel> listaProdutos;
}
