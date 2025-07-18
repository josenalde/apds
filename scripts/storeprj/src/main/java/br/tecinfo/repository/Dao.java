package br.tecinfo.repository;

import java.util.List;

public interface Dao<T> { //generic
    Object get(Long id);
    List<T> list();
    int add(T t);
    boolean update(T t, String[] params);
    boolean delete(T t);
}
