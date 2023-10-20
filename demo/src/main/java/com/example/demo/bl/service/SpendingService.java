package com.example.demo.bl.service;

import com.example.demo.dl.dao.IRepository;
import com.example.demo.dl.domain.SpendingEntity;
import org.springframework.stereotype.Service;

@Service
public class SpendingService extends CrudService<SpendingEntity, Long> {
    /**
     * Initialize the CRUD service with the DAO repository
     *
     * @param repository the DAO repository.
     * @throws RuntimeException if repository is null
     */
    protected SpendingService(IRepository<SpendingEntity, Long> repository) {
        super(repository);
    }

    @Override
    protected Long id(SpendingEntity e) {
        return null;
    }
}
