package com.example.jobextractor.service.impl;

import com.example.jobextractor.entity.FolderEntity;
import com.example.jobextractor.entity.IncondEntity;
import com.example.jobextractor.repository.FolderRepository;
import com.example.jobextractor.repository.IncondRepository;
import com.example.jobextractor.service.FolderService;
import com.example.jobextractor.service.IncondService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FolderServiceImpl implements FolderService {
    private final FolderRepository folderRepository;


    public FolderServiceImpl(FolderRepository folderRepository) {
        this.folderRepository = folderRepository;
    }

    @Override
    public List<FolderEntity> findAll() {
        return List.of();
    }

    @Override
    public Optional<FolderEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public FolderEntity save(FolderEntity folder) {
        return null;
    }

    @Override
    public FolderEntity update(FolderEntity folder) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
