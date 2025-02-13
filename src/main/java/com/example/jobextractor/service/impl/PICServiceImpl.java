package com.example.jobextractor.service.impl;

import com.example.jobextractor.entity.FolderEntity;
import com.example.jobextractor.entity.PICEntity;
import com.example.jobextractor.entity.dto.req.ReqPICDto;
import com.example.jobextractor.entity.dto.res.BaseResponseDto;
import com.example.jobextractor.repository.FolderRepository;
import com.example.jobextractor.repository.PICRepository;
import com.example.jobextractor.service.FolderService;
import com.example.jobextractor.service.PICService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class PICServiceImpl implements PICService {
    private final PICRepository picRepository;

    public PICServiceImpl(PICRepository picRepository) {
        this.picRepository = picRepository;
    }

    @Override
    public List<PICEntity> findAll() {
        return List.of();
    }

    @Override
    public Optional<PICEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public BaseResponseDto save(ReqPICDto pic) {
        try {
            PICEntity newPic = new PICEntity();

            newPic.setName(pic.getName());
            newPic.setEmail(pic.getEmail());
            newPic.setInitial(pic.getInitial());

            picRepository.save(newPic);

            Map<String, Object> data = new HashMap<>();
            data.put("pic", newPic);

            return BaseResponseDto.builder()
                    .status(HttpStatus.CREATED)
                    .description("PIC created successfully")
                    .data(data)
                    .build();
        }catch(Exception e){
            return BaseResponseDto.builder().data(new HashMap<>())
                    .status(HttpStatus.BAD_REQUEST)
                    .description("Failed to save PIC")
                    .build();
        }
    }

    @Override
    public BaseResponseDto update(ReqPICDto pic) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
