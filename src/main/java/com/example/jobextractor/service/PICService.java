package com.example.jobextractor.service;

import com.example.jobextractor.entity.PICEntity;
import com.example.jobextractor.entity.dto.req.ReqPICDto;
import com.example.jobextractor.entity.dto.res.BaseResponseDto;

import java.util.List;
import java.util.Optional;

public interface PICService {
    List<PICEntity> findAll();
    Optional<PICEntity> findById(Long id);
    BaseResponseDto save(ReqPICDto pic);
    BaseResponseDto update(ReqPICDto pic);

    void delete(Long id);
}
