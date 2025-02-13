package com.example.jobextractor.service;

import com.example.jobextractor.entity.FolderEntity;

import java.util.List;
import java.util.Optional;

public interface FolderService {
    List<FolderEntity> findAll();
    Optional<FolderEntity> findById(Long id);
    FolderEntity save(FolderEntity folder);
    FolderEntity update(FolderEntity folder);

    void delete(Long id);
}
