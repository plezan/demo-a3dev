package com.example.demo.entities;

import com.example.demo.database.base.DbEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "schedule")
@Inheritance
public class Schedule extends DbEntity{

    @Column(name = "name")
    private String name;

    @OneToOne
    private Job job;

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
