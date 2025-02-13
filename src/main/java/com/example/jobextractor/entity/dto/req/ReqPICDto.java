package com.example.jobextractor.entity.dto.req;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ReqPICDto {
    @NotBlank
    private String name;
    @NotBlank
    private String email;
    @NotBlank
    private String initial;


}
