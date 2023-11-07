package org.example.specialtask.repository;

import java.util.List;

public interface IRepository<T> {
    List<T> getAll();
    void add(T entity);
    void update(T entity);
    void delete(T entity);

}