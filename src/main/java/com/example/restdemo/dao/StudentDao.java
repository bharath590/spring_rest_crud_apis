package com.example.restdemo.dao;
import com.example.restdemo.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student, Integer> {
    // Additional custom query methods can be defined here
}
