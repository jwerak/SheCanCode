package com.example.demo.bl.service;


import com.example.demo.dl.dao.IRepository;

import java.util.Optional;

/**
 * CrudService is a generic class that implements the CRUD operations.
 * It is abstract and is extended by the service classes.
 *
 * @param <T>  Entity type
 * @param <ID> ID type
 */
public abstract class CrudService<T, ID> {
    protected IRepository<T, ID> repository;

    /**
     * Initialize the CRUD service with the DAO repository
     *
     * @param repository the DAO repository.
     * @throws RuntimeException if repository is null
     */
    protected CrudService(IRepository<T, ID> repository) {
        if (repository == null) {
            throw new RuntimeException();
        }
        this.repository = repository;
    }

    /**
     * Get ID of entity
     *
     * @param e Entity to get ID from
     * @return ID of entity
     */
    protected abstract ID id(T e);

    /**
     * Create record
     *
     * @param e Entity which is inserted into the table
     * @return Entity inserted into table if successful
     * @throws RuntimeException if entity already exists
     */
    public T create(T e) {
        if (id(e) != null && repository.findById(id(e)).isPresent()) {
            throw new RuntimeException();
        } else {
            return repository.save(e);
        }
    }

    /**
     * Returns all entities in table
     *
     * @return All found entities
     */
    public Iterable<T> read() {
        return repository.findAll();
    }

    /**
     * Read records by ID
     *
     * @param id ID of entity which you want to read
     * @return Entity if entity was found, or null if not found
     */
    public Optional<T> readById(ID id) {
        return repository.findById(id);
    }

    /**
     * Modify record in table
     *
     * @param id ID of existing record
     * @param e  New entity to update old entity with
     * @throws RuntimeException if id does not exist
     * @throws RuntimeException if new entity and id to replace do not match
     */
    public void update(ID id, T e) {
        if (repository.findById(id(e)).isEmpty())
            throw new RuntimeException();
        if (!id(e).equals(id))
            throw new RuntimeException();

        repository.save(e);
    }

    /**
     * Delete record in table by ID
     *
     * @param id ID of record to delete
     * @throws RuntimeException if ID does not exist
     */
    public void deleteById(ID id) {
        if (repository.findById(id).isEmpty())
            throw new RuntimeException();
        repository.delete(id);
    }
}

