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

    @Column(name = "firstname")
    private String firstname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    
}
