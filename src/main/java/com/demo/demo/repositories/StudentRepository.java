package com.demo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.demo.models.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
