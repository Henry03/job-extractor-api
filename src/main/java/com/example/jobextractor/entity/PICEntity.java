package com.example.jobextractor.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "pic")
@Data
public class PICEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "initial")
    private String initial;

    @OneToMany(mappedBy = "pic")
    private List<JobEntity> jobs;
}
