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
    private User user;

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
