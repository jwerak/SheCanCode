package com.example.demo.dl.dao;

import java.util.List;
import java.util.Optional;

public interface IRepository<T, ID> {
    List<T> findAll();

    Optional<T> findById(ID id);

    T save(T entity);

    void delete(ID id);

}
