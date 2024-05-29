package data.base;

import java.util.List;

public interface Repository<T> {
    void save(T entity);

    T findById(Long id);

    List<T> findAll();

    void update(T entity);

    void deleteById(Long id);

    boolean existsById(Long id);
}
