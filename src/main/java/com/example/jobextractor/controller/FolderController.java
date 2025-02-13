package com.example.jobextractor.controller;

import com.example.jobextractor.entity.FolderEntity;
import com.example.jobextractor.entity.dto.req.ReqFolderDto;
import com.example.jobextractor.entity.dto.req.ReqIncondDto;
import com.example.jobextractor.entity.dto.req.ReqJobDto;
import com.example.jobextractor.entity.dto.req.ReqUploadDto;
import com.example.jobextractor.service.JobService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/folders")
@Validated
public class FolderController {
    private final JobService jobService;

    public FolderController(JobService jobService)
    {
        this.jobService = jobService;
    }

//    @PostMapping("/create")
//    public ResponseEntity<ReqUploadDto> saveJob(@Valid @RequestBody ReqUploadDto upload)
//    {
//        FolderEntity folder = jobService.saveJob(upload.getFolder().getChildren());
//        return new ResponseEntity<>(response, response.getStatus());
//    }
}
