package org.example.specialtask.Repository;

import java.util.List;

public interface IRepository<T> {
    List<T> getAll();
    void create(T entity);
    void update(T entity);
    void delete(T entity);
}