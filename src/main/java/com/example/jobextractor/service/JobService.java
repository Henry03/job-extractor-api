package com.example.jobextractor.service;

import com.example.jobextractor.entity.JobEntity;
import com.example.jobextractor.entity.dto.req.ReqJobDto;
import com.example.jobextractor.entity.dto.req.ReqUploadDto;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface JobService {
    List<JobEntity> findAllJob();
    Optional<JobEntity> findById(UUID id);
    JobEntity saveJob(ReqJobDto job);
    JobEntity updateJob(JobEntity job);

    void deleteJob(UUID id);
}
