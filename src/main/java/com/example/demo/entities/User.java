package com.example.demo.entities;

import java.util.List;

import javax.persistence.*;

import com.example.demo.database.base.DbEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

@Entity
@Table(name = "utilisateur")
@Inheritance
public class User extends DbEntity {

    @Column(name = "id")
    private Long id;

    @Column(name = "firstname")
    private String firstname;
    
    @Column(name = "lastname")
    private String lastname;
    
    @ManyToMany(targetEntity = Role.class, mappedBy = "users")
    private List<Role> roles;
    
    @ManyToOne
    private Job job;

    @OneToOne
    private Schedule schedule;

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
