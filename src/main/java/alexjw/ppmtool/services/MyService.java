package alexjw.ppmtool.services;

import alexjw.ppmtool.domain.MyDomain;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public abstract class MyService<T extends MyDomain, ID, R extends CrudRepository<T, ID>> implements BasicService<T, ID> {

    R repository;

    public MyService(R repository) {
        this.repository = repository;
    }

    @Override
    public List<T> findAll() {
        return IterableUtils.toList(repository.findAll());
    }

    @Override
    public T findById(ID id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public T save(T object) {
        return repository.save(object);
    }

    @Override
    public void delete(T object) {
        repository.delete(object);
    }

    @Override
    public void deleteById(ID id) {
        repository.deleteById(id);
    }

}
