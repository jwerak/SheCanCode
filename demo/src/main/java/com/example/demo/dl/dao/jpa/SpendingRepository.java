package com.example.demo.dl.dao.jpa;

import com.example.demo.dl.domain.SpendingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpendingRepository extends JpaRepository<SpendingEntity,Long> {
}
