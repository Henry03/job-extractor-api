package com.example.jobextractor.entity.dto.req;

import java.util.List;

public class ReqJobDto {
    private String application;
    private String subApplication;
    private String memName;
    private String jobName;
    private boolean checked;
    private List<ReqIncondDto> children;

    // Getters and Setters
    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getSubApplication() {
        return subApplication;
    }

    public void setSubApplication(String subApplication) {
        this.subApplication = subApplication;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public List<ReqIncondDto> getChildren() {
        return children;
    }

    public void setChildren(List<ReqIncondDto> children) {
        this.children = children;
    }
}
