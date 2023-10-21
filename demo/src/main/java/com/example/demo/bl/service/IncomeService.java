package com.example.demo.bl.service;

import com.example.demo.dl.dao.interfaces.IRepository;
import com.example.demo.dl.domain.IncomeEntity;
import org.springframework.stereotype.Service;

@Service
public class IncomeService extends CrudService<IncomeEntity, Long> {

    /**
     * Initialize the CRUD service with the DAO repository
     *
     * @param repository the DAO repository.
     * @throws RuntimeException if repository is null
     */
    protected IncomeService(IRepository<IncomeEntity, Long> repository) {
        super(repository);
    }

    @Override
    protected Long id(IncomeEntity e) {
        return null;
    }
}
