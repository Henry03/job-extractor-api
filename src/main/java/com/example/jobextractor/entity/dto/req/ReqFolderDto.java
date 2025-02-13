package com.example.jobextractor.entity.dto.req;

import java.util.List;

public class ReqFolderDto {
    private String datacenter;
    private String folderName;
    private List<ReqJobDto> children;

    // Getters and Setters
    public String getDatacenter() {
        return datacenter;
    }

    public void setDatacenter(String datacenter) {
        this.datacenter = datacenter;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public List<ReqJobDto> getChildren() {
        return children;
    }

    public void setChildren(List<ReqJobDto> children) {
        this.children = children;
    }
}
