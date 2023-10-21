package com.example.demo.dl.dao.jpa;

import com.example.demo.dl.dao.interfaces.ISpendingRepository;
import com.example.demo.dl.domain.SpendingEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class SpendingImpl implements ISpendingRepository {
    @Override
    public List<SpendingEntity> findAll() {
        return null;
    }

    @Override
    public Optional<SpendingEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public SpendingEntity save(SpendingEntity entity) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
