package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

import com.example.demo.database.base.DbEntity;

@Entity
@Table(name = "utilisateur")
@Inheritance
public class User extends DbEntity {

    @Column(name = "id")
    private Long id;

    @Column(name = "firstname")
    private String firstname;

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    
}
