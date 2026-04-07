package Domain.Interface.Base;

import Domain.Model.Base.BaseModel;

import java.util.List;

public interface IBaseRepository<TModel extends BaseModel>
{
    List<TModel> GetAll();
    TModel GetById(int id);
    TModel Create(TModel model);
    TModel Update(TModel model);
    void DeleteById(int id);
}
