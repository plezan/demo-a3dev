package com.example.demo.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
