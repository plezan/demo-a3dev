package com.example.demo.entities;

import com.example.demo.database.base.DbEntity;

public class User extends DbEntity {

    private String firstname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    
}
