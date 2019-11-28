package alexjw.ppmtool.services;

import java.util.List;

public interface BasicService<T, ID> {

    public List<T> findAll();

    public T findById(ID id);

    public T save(T object);

    public void delete(T object);

    public void deleteById(ID id);

}
