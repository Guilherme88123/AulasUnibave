package Domain.Model.Product;

import Domain.Model.Base.BaseModel;
import Domain.Model.Category.CategoryModel;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "product")
@Table(name = "product")
public class ProductModel extends BaseModel
{
    @Column(nullable = false, length = 50)
    public String name;

    @Column(nullable = false)
    public double price;

    @Column(nullable = false)
    public LocalDate editDate;

    @Column(nullable = false)
    public boolean enable;

    @Column(nullable = false)
    public int categoryId;

    @ManyToOne
    @JoinColumn(name = "categoryid")
    public CategoryModel category;

    public ProductModel ()
    {
    }

    public ProductModel (String name, double price, boolean enable, int categoryId)
    {
        this.name = name;
        this.price = price;
        this.editDate = LocalDate.now();
        this.enable = enable;
        this.categoryId = categoryId;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public LocalDate getEditDate() { return editDate; }
    public boolean getEnable() { return enable; }
    public int getCategoryId() { return categoryId; }
    public CategoryModel getCategory() { return category; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
    public void setEditDate(LocalDate editDate) { this.editDate = editDate; }
    public void setEnable(boolean enable) { this.enable = enable; }
    public void setCategoryId(int categoryId) { this.categoryId = categoryId; }
}
