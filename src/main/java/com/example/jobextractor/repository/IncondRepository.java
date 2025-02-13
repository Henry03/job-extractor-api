package com.example.jobextractor.repository;

import com.example.jobextractor.entity.IncondEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncondRepository extends JpaRepository<IncondEntity, Long> {
}
