package com.example.jobextractor.service;

import com.example.jobextractor.entity.IncondEntity;

import java.util.List;
import java.util.Optional;

public interface IncondService {
    List<IncondEntity> findAll();
    Optional<IncondEntity> findById(Long id);
    IncondEntity save(IncondEntity incond);
    IncondEntity update(IncondEntity incond);

    void delete(Long id);
}
