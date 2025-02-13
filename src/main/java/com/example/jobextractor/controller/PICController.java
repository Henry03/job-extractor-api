package com.example.jobextractor.controller;

import com.example.jobextractor.entity.dto.req.ReqPICDto;
import com.example.jobextractor.entity.dto.res.BaseResponseDto;
import com.example.jobextractor.service.JobService;
import com.example.jobextractor.service.PICService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pic")
@Validated
public class PICController {
    private final PICService picService;

    public PICController(PICService picService) {
        this.picService = picService;
    }


    @PostMapping("/create")
    public ResponseEntity<BaseResponseDto> saveJob(@Valid @RequestBody ReqPICDto pic)
    {
        BaseResponseDto response = picService.save(pic);
        return new ResponseEntity<>(response, response.getStatus());
    }
}
