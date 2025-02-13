package com.example.jobextractor.service.impl;

import com.example.jobextractor.entity.IncondEntity;
import com.example.jobextractor.entity.JobEntity;
import com.example.jobextractor.repository.IncondRepository;
import com.example.jobextractor.repository.JobRepository;
import com.example.jobextractor.service.IncondService;
import com.example.jobextractor.service.JobService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class IncondServiceImpl implements IncondService {
    private final IncondRepository incondRepository;

    public IncondServiceImpl(IncondRepository incondRepository) {
        this.incondRepository = incondRepository;
    }

    @Override
    public List<IncondEntity> findAll() {
        return incondRepository.findAll();
    }

    @Override
    public Optional<IncondEntity> findById(Long id) {
        return incondRepository.findById(id);
    }

    @Override
    public IncondEntity save(IncondEntity incond) {
        return incondRepository.save(incond);
    }

    @Override
    public IncondEntity update(IncondEntity incond) {
        return incondRepository.save(incond);
    }

    @Override
    public void delete(Long id) {
        incondRepository.deleteById(id);
    }
}
