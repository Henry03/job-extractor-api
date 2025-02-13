package com.example.jobextractor.controller;

import com.example.jobextractor.entity.JobEntity;
import com.example.jobextractor.entity.dto.req.ReqJobDto;
import com.example.jobextractor.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/jobs")
public class JobController {
    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping
    public List<JobEntity> findAllJob() {
        return jobService.findAllJob();
    }

    @GetMapping("/{id}")
    public Optional<JobEntity> findById(
        @PathVariable("id") UUID id
    ) {
        return jobService.findById(id);
    }

    @PostMapping
    public JobEntity saveJob(@RequestBody ReqJobDto job) {
        return jobService.saveJob(job);
    }

    @PutMapping
    public JobEntity updateJob(@RequestBody JobEntity job) {
        return jobService.updateJob(job);
    }

    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable("id") UUID id) {
        jobService.deleteJob(id);
    }
}
