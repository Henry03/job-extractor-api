package com.example.jobextractor.entity.dto.req;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class ReqUploadDto {
    @NotBlank(message = "Name is required")
    private String name;

    @NotNull(message = "Folder is required")
    private ReqFolderDto folder;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReqFolderDto getFolder() {
        return folder;
    }

    public void setFolder(ReqFolderDto folder) {
        this.folder = folder;
    }
}
