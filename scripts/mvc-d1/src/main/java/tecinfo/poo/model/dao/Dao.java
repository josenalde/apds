package tecinfo.poo.model.dao;

import java.util.List;

public interface Dao<T> { //generic
    Object get(Long id);
    List<T> getAll();
    int save(T t);
    boolean update(T t, String[] params);
    boolean delete(T t);
}
