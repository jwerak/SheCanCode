package com.example.demo.dl.dao.jpa;

import com.example.demo.dl.dao.interfaces.IIncomeRepository;
import com.example.demo.dl.domain.IncomeEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class IncomeImpl implements IIncomeRepository {
    @Override
    public List<IncomeEntity> findAll() {
        return null;
    }

    @Override
    public Optional<IncomeEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public IncomeEntity save(IncomeEntity entity) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
