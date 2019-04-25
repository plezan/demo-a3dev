package com.example.demo.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {

}
