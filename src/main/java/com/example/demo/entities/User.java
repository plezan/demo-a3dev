package com.example.demo.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.database.base.DbEntity;

@Entity
@Table(name = "utilisateur")
@Inheritance
public class User extends DbEntity {

    @Column(name = "firstname")
    private String firstname;
    
    @Column(name = "lastname")
    private String lastname;
    
    @ManyToMany(targetEntity = Role.class, mappedBy = "users")
    private List<Role> roles;
    
    @ManyToOne
    private Job job;

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
}
