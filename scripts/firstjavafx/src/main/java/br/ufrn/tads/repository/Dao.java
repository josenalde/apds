package br.ufrn.tads.repository;
import java.util.List;

public interface Dao<T> { //generics
    Object findById(Long id);
    List<T> findAll();
    int save(T t);
    boolean update(T t, String[] params);
    boolean delete(T t);
}

