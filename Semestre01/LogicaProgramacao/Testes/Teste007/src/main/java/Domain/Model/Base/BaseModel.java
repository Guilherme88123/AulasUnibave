package Domain.Model.Base;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public abstract class BaseModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
}
