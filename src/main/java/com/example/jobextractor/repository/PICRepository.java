package com.example.jobextractor.repository;

import com.example.jobextractor.entity.PICEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PICRepository extends JpaRepository<PICEntity, Long> {
}
