package com.example.jobextractor.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "job")
public class JobEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "application")
    private String application;

    @Column(name= "sub_application")
    private String subApplication;

    @Column(name = "file")
    private String file;

    @Column(name = "name")
    private String name;

    @Column(name = "isCheck")
    private Boolean isCheck;

    public JobEntity() {

    }

    public JobEntity(UUID id, String application, String subApplication, String file, String name, Boolean isCheck) {
        this.id = id;
        this.application = application;
        this.subApplication = subApplication;
        this.file = file;
        this.name = name;
        this.isCheck = isCheck;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getCheck() {
        return isCheck;
    }

    public void setCheck(Boolean check) {
        isCheck = check;
    }
}
