package com.example.demo.entities;

import java.util.List;

import javax.persistence.*;

import com.example.demo.database.base.DbEntity;

@Entity
@Table(name = "job")
@Inheritance
public class Job extends DbEntity{

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    
    @OneToMany(targetEntity = User.class, mappedBy = "job")
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @OneToOne
    private Schedule schedule;

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
