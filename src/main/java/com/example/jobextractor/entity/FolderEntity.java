package com.example.jobextractor.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "folder")
public class FolderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_center")
    private String dataCenter;

    @Column(name= "name")
    private String name;

    @OneToMany(mappedBy = "folder")
    private List<JobEntity> jobs;

    public FolderEntity(Long id, String dataCenter, String name, List<JobEntity> jobs) {
        this.id = id;
        this.dataCenter = dataCenter;
        this.name = name;
        this.jobs = jobs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataCenter() {
        return dataCenter;
    }

    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<JobEntity> getJobs() {
        return jobs;
    }

    public void setJobs(List<JobEntity> jobs) {
        this.jobs = jobs;
    }
}
