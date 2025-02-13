package com.example.jobextractor.service.impl;

import com.example.jobextractor.entity.JobEntity;
import com.example.jobextractor.entity.dto.req.ReqJobDto;
import com.example.jobextractor.repository.JobRepository;
import com.example.jobextractor.service.JobService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class JobServiceImpl implements JobService {
    private final JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public List<JobEntity> findAllJob() {
        return jobRepository.findAll();
    }

    @Override
    public Optional<JobEntity> findById(UUID id) {
        return jobRepository.findById(id);
    }

    @Override
    public JobEntity saveJob(ReqJobDto job) {
        return null;
    }

    @Override
    public JobEntity updateJob(JobEntity job) {
        return jobRepository.save(job);
    }

    @Override
    public void deleteJob(UUID id) {
        jobRepository.deleteById(id);
    }
}
