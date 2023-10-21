package com.example.demo.dl.dao.jpa;

import com.example.demo.dl.domain.IncomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeRepository extends JpaRepository<IncomeEntity,Long> {
}
